import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        int b=aki.nextInt();
        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping:\n A is:"+a+"\n B is:"+b);
    }
}
