import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=aki.nextInt();
        int b=aki.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After Swapping:\n A is:"+a+"\nB is:"+b);
    }
}
