import java.util.Scanner;
public class akila{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=aki.nextInt();
        int a=-1,b=1,c;
        System.out.println("The fibonacci of the number is:");
        for(int i=0;i<=n;i++)
        {
           c=a+b;
           System.out.println(c);
           a=b;
           b=c;
        }
    }
}
