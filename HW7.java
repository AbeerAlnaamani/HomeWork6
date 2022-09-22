import java.util.Scanner;
        public class HW7 {
    public static void main(String args[]) {
        Scanner abeer=new Scanner(System.in);
        System.out.println("enter number : ");
        int x=abeer.nextInt();
        while(x!=0){
            System.out.println(x%2);
            x/=2;
        }
    }
}

