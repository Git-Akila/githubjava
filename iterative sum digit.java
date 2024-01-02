import java.util.Scanner;
public class akila{
    public static void main(String args[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        int sum=0;
        while(a!=0){

            int b=a%10;
            sum=sum+b;
            a=a/10;
        }
        System.out.println("The sum is:"+sum);
    }
}
