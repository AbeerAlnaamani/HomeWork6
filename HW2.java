import java.util.Scanner;
public class HW2 {
    public static void main(String[] args) {
        int sum=0,a,b,sum2=0;
        for (int i=2;i<=100;i++)
        {if(i%2==0)
        { sum=sum+i;}
        }
        System.out.println("sum="+sum);
        Scanner in=new Scanner(System.in);
        System.out.println("enter 2  numbers : ");
        a=in.nextInt();
        b=in.nextInt();
        for (int i=a;i<=b;i++)
        {if(i%2!=0)
        { sum2=sum2+i;}
        }System.out.println("sum="+sum2);

    }}






