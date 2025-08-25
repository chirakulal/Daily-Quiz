import java.util.Scanner;

public class PrimeNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num =scanner.nextInt();
        int count=0;
        if(num<=1){
            System.out.println("It is not a prime Number");
        }else{
            for (int i=1;i<num/2;i++){
                if(num%i==0){
                    count++;
                }
            }
        }

        if(count>=2){
            System.out.println("It is not a prime number");
        }else {
            System.out.println("Its is a prime Number");
        }
    }
}
