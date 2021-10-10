package GrpcServer;

import GrpcService.ExamGrpcServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExamGrpcServer {

    private static final Logger logger = Logger.getLogger(ExamGrpcServiceImpl.class.getName());

    public static void main(String[] args) {
        //Starting on a port
        Server server = ServerBuilder.forPort(8075) // Starting on port 8075
                .addService(new ExamGrpcServiceImpl())
                .build();

        try {
            server.start();
            logger.log(Level.INFO, "RESULT SERVER STARTED ON PORT 8075");
            server.awaitTermination();
        } catch (IOException e) {
            logger.log(Level.SEVERE, "RESULT SERVER DID NOT START");
        } catch (InterruptedException e) {
            logger.log(Level.SEVERE, "SERVER SHUT DOWN ON INTERRUPTED");
        }

    }
}

