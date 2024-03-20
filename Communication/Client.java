import java.net.*;
import java.io.*;
import java.util.*;

public class Client {
    private static String _ipaddr = "192.168.180.138";
    private static int _port = 1234;

    public static void main(String args []) {
        Scanner sc = new Scanner(System.in);
        try ( Socket server = new Socket(_ipaddr, _port) ){
            System.out.println("Connected to server..");
            PrintWriter pr = new PrintWriter(server.getOutputStre>
            while( true ) {
                String str = sc.nextLine();
                pr.println(str);
                }
        }
        catch(Exception e) {
            System.out.println("Connection error");
        }
    }
}
