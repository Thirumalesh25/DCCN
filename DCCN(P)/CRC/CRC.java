import java.util.*;

class CRC{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Generator : ");
        String g = sc.next();
        System.out.print("Data : ");
        String data = sc.next();

        String c =data +"0".repeat(g.length()-1);
        String r = div(c, g);
       
        String word = data + r;
        System.out.println("Transmitted Code Word : " + word);

        System.out.print("Received Code Word : ");
        String rword = sc.next();

        String rr = div(rword, g);
        if (rr.equals("0".repeat(g.length() - 1))) 
            System.out.println("No errors.");
        else
            System.out.println("Contains errors.");
    }

    static String div(String c, String g) {
        String r = c.substring(0, g.length());

        for (int i = g.length(); i < c.length(); i++) {
            r = xor(r, g);
            r = r.substring(1) + c.charAt(i);
        }
        r = xor(r, g);
        return r.substring(1);
    }

    static String xor(String a, String b) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < a.length(); i++) {
            res.append(a.charAt(i) == b.charAt(i) ? '0' : '1');
        }
        return res.toString();
    }
}