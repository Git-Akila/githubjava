import java.util.Scanner;
public class akila
{
    public static void main(String args[])
    {
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        int perfect=0,b=a;
       for(int i=1;i<a;i++) {
           if(a%i==0){
           perfect=perfect+i;
       }
    }
       if(perfect==b){
           System.out.println("The number is perfect");
       }
       else{
           System.out.println("The number is not perfect");
       }
}}
