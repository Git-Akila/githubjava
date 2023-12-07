import java.util.Scanner;
public class akila
{
    public static void main(String arg[]){
        Scanner aki=new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int a=aki.nextInt();
        int b=aki.nextInt();
        int c=aki.nextInt();
        int temp=a>b?a:b;

        int temp1=c>temp?c:temp;
        System.out.println(temp1+"\tis greater");
}}
