import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerNew {
    private static int t = 5;
    public static void main(String[] args) throws Exception {
        try (ServerSocket server = new ServerSocket(1234)) {
            System.out.println("Server is listening on port 1234...");
            Socket client = server.accept();
            String clientIP = client.getInetAddress().getHostAddress();
            System.out.println("Connected With " + clientIP);
            
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            System.out.println("Sending message to client in...");
            out.println("Hello "+ clientIP);
        } catch (IOException e) {
            System.out.println("Connection Error");
        }
    }
}
