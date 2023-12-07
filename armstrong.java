import java.util.Scanner;
public class akila {
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a=aki.nextInt();
        int sum=0,original=a;
        while(a!=0)
        {
            int b=a%10;
            sum=sum+(b*b*b);
            a=a/10;
        }
        if(sum==original) {
            System.out.println("The num is Armstrong");
        }else {
            System.out.println("The Num is not armstrong");
        }
    }
}
