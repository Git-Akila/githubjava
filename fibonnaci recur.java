import java.util.Scanner;
public class akila{
        public static int recur(int i)
        {
                if(i==0)
                {
                        return 0;
                }
                if(i==1 || i==2)
                {
                        return 1;
                }
                return recur(i-1)+recur(i-2);
        }

        public static void main(String args[])
        {
                Scanner aki=new Scanner(System.in);
                System.out.println("enter the number:");
                int a=aki.nextInt();
                for(int i=0;i<=a;i++)
                {
                        System.out.println(recur(i));
                }
        }
}
