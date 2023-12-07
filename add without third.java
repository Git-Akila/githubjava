import java.util.Scanner;
public class akila
{
        public static int add(int a,int b)
        {
                for(int i=1;i<=b;i++)
                {
                        a++;
                }
                return a;
        }
        public static void main(String args[])
        {
                Scanner aki=new Scanner(System.in);
                System.out.println("Enter the numbers:");
                int a=aki.nextInt();
                int b=aki.nextInt();
                System.out.println(add(a,b));
        }
}
