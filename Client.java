import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 1234)) {
            System.out.println("Connected to the server...");

            Scanner sc = new Scanner(socket.getInputStream());

            String str = sc.nextLine();
            System.out.println("Server: " + str);

            sc.close();
            socket.close();
        } catch (Exception e) {
            System.out.println("Connection Error");
        }
    }
}
