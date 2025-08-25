import java.util.Scanner;

public class ReverseDigits {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        int rev=0;

        while(num>0){
            int d =num%10;
            rev =rev*10+d;
            num=num/10;
        }

        System.out.println("Reverse of digits :"+rev);
    }
}
