import java.util.Scanner;

public class Palindrome {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num=scanner.nextInt();
        int org=num;
        int rev=0;

        while(num>0){
            int d = num%10;
            rev=rev*10+d;
            num=num/10;
        }
        System.out.println(rev);
        if(rev==org){
            System.out.println("it is a Palindrome");
        }else System.out.println("it is not a palindrome");
    }
}
