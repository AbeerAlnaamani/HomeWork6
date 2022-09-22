import java.util.Scanner;
        public class HW8 {
    public static void main(String args[]) {
        Scanner abeer=new Scanner(System.in);
        System.out.println("enter number : ");
        int x=abeer.nextInt();
        Boolean t;
        for(int i=2;i<x;i++){
            t=true;
            for(int j=2;j<i;j++){
                if(i%j==0) {
                    t=false;
                    break;
                }
            }
            if(t) System.out.println(i);
        }
    }
}
