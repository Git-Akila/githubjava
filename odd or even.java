import java.util.Scanner;
public class akila
{
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        if(a%2==0)
        {
            System.out.println("The\t"+a+"\tnum is even ");
        }else {
            System.out.println("The num is odd");
        }
    }
}
