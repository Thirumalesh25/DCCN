import java.io.*;
import java.net.*;
import java.util.*;
public class Client
{
	public static void main(String args[]) throws Exception {
		Socket s=new Socket("localhost",5000);
		System.out.println("Connected to Server");
		Scanner sc=new Scanner(System.in);
		DataOutputStream dout=new DataOutputStream(s.getOutputStream());
		while(true){
		    String a=sc.nextLine();
    		dout.writeUTF(a);
    		dout.flush();
		    if(a.equalsIgnoreCase("Over")) break;
		}
		dout.close();
		s.close();
	}
}
