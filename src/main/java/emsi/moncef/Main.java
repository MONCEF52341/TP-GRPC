package emsi.moncef;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server= ServerBuilder.forPort(11532).addService(new UserService()).build();
        server.start();
        System.out.println("Serveur demarre au port : "+server.getPort());
        server.awaitTermination();
    }
}