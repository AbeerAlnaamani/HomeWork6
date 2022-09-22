import java.util.Scanner;
public class HW4 {
    public static void main(String[] args) {
        String a;
        Scanner in = new Scanner(System.in);
        System.out.println("enter word : ");
        a=in.next();
        char[] ar=a.toCharArray();
        StringBuilder builder=new StringBuilder();
        for (int i=ar.length-1;i>=0;i--) {
            builder.append(ar[i]);
        }
        String s=builder.toString();
        System.out.print(s);
    }}

