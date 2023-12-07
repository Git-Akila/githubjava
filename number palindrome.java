import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        int sum=0,s=a;
        while(a!=0)
        {
            int b=a%10;
            sum=(sum*10)+b;
            a=a/10;
        }
        if(s==sum)
        {
            System.out.println("Number is a palindrome");
        }
        else {
            System.out.println("Number is not a palindrome");
        }
    }
}
