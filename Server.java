import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Server {
    private static int t = 5;
    public static void main(String[] args) throws Exception {
        try (ServerSocket server = new ServerSocket(1234)) {
            System.out.println("Server is listening on port 1234...");
            Thread.sleep(1500);
            Socket client = server.accept();
            System.out.println("A client connected....");
            Thread.sleep(2000);
            String clientIP = client.getInetAddress().getHostAddress();
            System.out.println("Client's IP: " + clientIP);
            Thread.sleep(1000);
            
            Scanner sc = new Scanner(client.getInputStream());
            PrintWriter out = new PrintWriter(client.getOutputStream(), true);

            System.out.println("Sending message to client in...");
            while(t>=0) {
                Thread.sleep(1000);
                System.out.print(t+"...");
                if(t==0) System.out.println("\nMessage sent successfully....");
                t--;
            }
            Thread.sleep(1000);
            out.println("Hello "+ clientIP);
            System.out.println();

        } catch (IOException e) {
            System.out.println("Connection Error");
        }
    }
}
