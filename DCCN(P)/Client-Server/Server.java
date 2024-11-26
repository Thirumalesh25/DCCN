import java.io.*;
import java.net.*;
public class Server
{
	public static void main(String args[]) throws Exception {
	    System.out.println("Server started. Waiting for client...");
		ServerSocket ss=new ServerSocket(5000);
		Socket s=ss.accept();
		System.out.println("Client Connected");
		DataInputStream dis=new DataInputStream(s.getInputStream());
		while (true) {
            String line = dis.readUTF();
            if (line.equalsIgnoreCase("Over")) break;
            System.out.println("Client: " + line);
        }
        System.out.println("Closing connection");
	}
}