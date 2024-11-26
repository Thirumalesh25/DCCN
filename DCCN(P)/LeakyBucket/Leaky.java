import java.util.*;

class Leaky{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("No.of queries: ");
        int nq = sc.nextInt();
        System.out.print("Bucket size: ");
        int bs = sc.nextInt();
        System.out.print("Input packet size: ");
        int ips = sc.nextInt();
        System.out.print("Output packet size: ");
        int ops = sc.nextInt();
       
        int st = 0;

        for (int i = 0; i < nq; i++) {
            int sl = bs - st;

            if (ips <= sl) {
                st += ips;
            } else {
                int pl = ips - sl;
                st = bs;
                System.out.println("Packet loss = " + pl + " (overflow)");
            }
            System.out.println("Buffer size = " + st + " out of bucket size = " + bs);
           
            st -= ops;
            if (st < 0) st = 0;
        }
    }
}