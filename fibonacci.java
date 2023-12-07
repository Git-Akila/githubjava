import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        int f=0,s=1,result=0;
        for(int i=0;i<=a;i++)
        {

        if(i<=1)
        {
            result=i;
        }else {
            result = f + s;
            f = s;
            s = result;

        }
        System.out.println(result);
    }
}}
