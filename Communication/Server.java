import java.net.*;
import java.util.*;

public class Server {
    private static String _ipaddr = "localhost";
    private static int _port = 1234;

    public static void main(String args []) {
        try (ServerSocket server = new ServerSocket(_port)){
            Socket s = server.accept();
            System.out.println("Client Connected");

            while(true) {
                Scanner sc = new Scanner(s.getInputStream());
                String msg = sc.nextLine();

                if(msg.equals("bye")) {
                    System.out.println("------------- Connection closed -------------");
                    s.close();
                    server.close();
                    return;
                }
                System.out.println("Client Message : "+ msg);

            }
        }
        catch(Exception e) {
            System.out.println("Connection error");
        }
    }
}
