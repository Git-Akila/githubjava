import java.util.Scanner;
public class akila
{
        public static void main(String args[])
        {
                Scanner aki=new Scanner(System.in);
                System.out.println("Enter the number:");
                int a=aki.nextInt();
                int fact=1;
                for(int i=1;i<=a;i++)
                {
                        fact=fact*i;
                }
                System.out.println("factorial is:"+fact);
        }
}
