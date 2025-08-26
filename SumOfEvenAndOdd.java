import java.util.Scanner;

public class SumOfEvenAndOdd {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        int evenSum=0,oddSum=0;
        while(num>0){
            int d=num%10;

            if(d%2==0){
                evenSum+=d;
            }else oddSum+=d;

            num=num/10;
        }
        System.out.println("Sum of even number in digit "+evenSum);
        System.out.println("Sum of odd number in digit "+oddSum);
    }
}
