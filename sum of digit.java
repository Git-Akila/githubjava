import java.util.Scanner;
public class akila{
public static int digit(int a) {
        if(a==0)
        {
                return 0;
        }

        return(a%10+digit(a/10));

}
public static void main(String args[])
        {Scanner aki=new Scanner(System.in);
                System.out.println("Enter the number:");
                int a=aki.nextInt();
                System.out.println("Sum of Digit:"+digit(a));

        }}
