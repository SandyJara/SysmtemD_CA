package grpc.ca.sandraLibrary;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.time.LocalTime;
import java.util.logging.Logger;

public class LibraryServer extends AirConditioningGrpc.AirConditioningImplBase {

    private static final Logger logger = Logger.getLogger(LibraryServer.class.getName());

    public static void main(String[] args) {
        LibraryServer libraryServer = new LibraryServer();
        int port = 50051;

        try {
            Server server = ServerBuilder.forPort(port)
                    .addService(libraryServer)
                    .build()
                    .start();

            System.out.println(LocalTime.now().toString() + ": Library Server has been started, it's listening on " + port);

            server.awaitTermination();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public StreamObserver<ControlRequest> controlTemperature(StreamObserver<ControlResponse> responseObserver) {
        return new StreamObserver<ControlRequest>() { //i had to change to streaming consideration
            @Override
            public void onNext(ControlRequest request) {
                int temperature = request.getTemperature();  //declaring temperature as integer
                String action = determineAction(temperature); // Determine what to do depending on what temperature I have
                ControlResponse response = ControlResponse.newBuilder().setAction(action).build();
                responseObserver.onNext(response); // Sending to the client the action executing 
            }

            
            
            
            
        };
    }

    private String determineAction(int temperature) {
        if (temperature > 22) {
            return "Decreasing temperature";
        } else if (temperature < 21) {
            return "Increasing temperature";
        } else {
            return "Keeping temperature";
        }
    }
}