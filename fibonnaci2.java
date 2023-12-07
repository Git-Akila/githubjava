import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        int b=-1,c=1,result;
        for(int i=0;i<=a;i++)
        {
            result=b+c;
            System.out.println(result);
            b=c;
            c=result;
        }
    }
}
