import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a=aki.nextInt();
        int b=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                b++;
            }
        }
        if(b==2)
        {
            System.out.println("The number is a Prime number");
        }
        else {
            System.out.println("This is not a prime number");
        }
    }
}
// o/p:
6 is not a prime number
  3 is a prime number
