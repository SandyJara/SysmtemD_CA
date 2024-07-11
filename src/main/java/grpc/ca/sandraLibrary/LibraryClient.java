package grpc.ca.sandraLibrary;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import grpc.ca.sandraLibrary.AirConditioningGrpc.AirConditioningStub;

public class LibraryClient {

    private static final Logger logger = Logger.getLogger(LibraryClient.class.getName());

    public static void main(String[] args) throws InterruptedException {
        String host = "localhost";
        int port = 50051;

        ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        AirConditioningStub stub = AirConditioningGrpc.newStub(channel);

        StreamObserver<ControlRequest> requestStreamObserver = stub.controlTemperature(new StreamObserver<ControlResponse>() { //it changed because I needed to add the streaming (not the unary response)
            @Override
            public void onNext(ControlResponse response) {
                String action = response.getAction();
                logger.info("Action from server received: " + action);
                
            }

            @Override
            public void onError(Throwable t) {
                logger.log(Level.WARNING, "Temperature controle NOT POSSIBLE to execute", t);
            }

            @Override
            public void onCompleted() {
                logger.info("Temperature control FINISHED satisfactory");
            }
        }
        );

        // Simulate sending temperature readings every few seconds
        try {
            for (int temperature =22 ; temperature <= 25; temperature++) { //this are just as an example to test my code, in real life it's supposed the number should be got by the real temperature
            	//in reall life the lecture of the temperature should be all the time needed while the library has operations
            	ControlRequest request = ControlRequest.newBuilder().setTemperature(temperature).build();
                requestStreamObserver.onNext(request);
                Thread.sleep(10000); // Adding some waiting time between my readings and the response needed
            }
        } catch (Exception e) {
            requestStreamObserver.onError(e);
            throw e;
        } finally {
            requestStreamObserver.onCompleted();
            channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
        }
    }
}