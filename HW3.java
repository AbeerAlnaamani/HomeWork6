import java.util.Scanner;
public class HW3 {
    public static void main(String[] args) {
        String a;
        Scanner in=new Scanner(System.in);
        System.out.println("enter word : ");
        a=in.next();
        for  (int i=0;i<a.length();i++)
        {char r=a.charAt(i);
            System.out.println(r);}
    }
}

