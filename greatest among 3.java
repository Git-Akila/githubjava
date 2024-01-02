import java.util.Scanner;
public class akila{
    public  static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a=aki.nextInt();
        int b=aki.nextInt();
        int c=aki.nextInt();
        if(a>b && a>c)
        {
            System.out.println("A is greater");
        }
        else if(b>a && b>c)
        {
            System.out.println("B is greater");
        }else{
            System.out.println("C is greater");
        }
    }
}
