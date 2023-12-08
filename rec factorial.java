import java.util.Scanner;

public class akila
{
    public static int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=aki.nextInt();
        int b=1;
        b=fact(n);
        System.out.println("The factorial is:"+b);
    }
}
