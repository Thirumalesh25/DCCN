import java.util.*;
import java.net.*;
class DNS{
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.print("1.DNS\t 2.Exit\nEnter your choice:");
            int n=sc.nextInt();
            if(n==1){
                System.out.print("Enter hostname : ");
                String s=sc.next();
                InetAddress ad=InetAddress.getByName(s);
                System.out.println("Host name: "+ad.getHostName());
                System.out.println("Host Address:"+ ad.getHostAddress());
            }
            else break;
        }
    }
}