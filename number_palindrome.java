import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        int b=a,reverse=0;
        while(a!=0)
        {
            int c=a%10;
            reverse=(reverse*10)+c;
            a=a/10;
        }
        System.out.println("After reversing the num is:"+reverse);
        if(b==reverse)
        {
            System.out.println("The num is a palindrome");
        }
        else{
            System.out.println("The num is not a palindrome");
        }
    }
}
