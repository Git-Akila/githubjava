import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner ak=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=ak.nextInt();
        System.out.println("The factor numbers are: ");
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                System.out.println(i);
            }
        }

    }
}
