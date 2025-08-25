import java.util.Scanner;

public class SumOfDigits {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num= scanner.nextInt();
        int sum=0;

        while(num>0){
            int d=num%10;
            sum+=d;
            num=num/10;
        }
        System.out.println("Sum of the digit is :"+sum);
    }
}
