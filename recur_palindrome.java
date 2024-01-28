import java.util.Scanner;
public class palindrome{
public static int pali(int a,int reverse){

        if(a==0){
            return reverse;
        }else{
            reverse=(reverse*10)+(a%10);
            return pali(a/10,reverse);
        }
}

    public static void main(String args[]) {
        Scanner aki = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a=aki.nextInt();
        int reverse=pali(a,0);
        if(reverse==a){
            System.out.println("It's Palindrome");
        }else {
            System.out.println("IT's not");
        }
}}
