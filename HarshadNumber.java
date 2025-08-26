import java.util.Scanner;

public class HarshadNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        int org=num;
        int sum=0;
        while(num>0){
            int d = num%10;
            sum=sum+d;
            num=num/10;
        }
        if(org%sum==0){
            System.out.println("it is a harsad number");
        }else System.out.println("it is not a harsad number");
    }
}
