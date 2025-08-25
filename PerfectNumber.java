import java.util.Scanner;

public class PerfectNumber {

    public static boolean isPerfect(int num){
        int sumOfDigits=1;
        if(num<=0){
            return false;
        }

        for (int i=2;i<=num/2;i++){
            if(num%i==0){
                sumOfDigits=sumOfDigits+i;
            }
        }
        return sumOfDigits==num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(isPerfect(num)){
            System.out.println("It is a perfect number");
        }else System.out.println("It is not a perfect number");
    }
}
