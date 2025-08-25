import java.util.Scanner;

public class ArmStrongNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int org=num;

       int numberOfDigits = String.valueOf(num).length();
       System.out.println(numberOfDigits);
//        int numberOfDigits=0;
//
//        while(num>0){
//            numberOfDigits++;
//            num=num/10;
//        }
//        System.out.println(numberOfDigits);

       // num=org;

        int sum=0;

        while(num>0){
            int d = num%10;
            sum=sum+(int)Math.pow(d,numberOfDigits);
            num=num/10;
        }


        if(org==sum){
            System.out.println("it is a armstrong number");
        }else {
            System.out.println("it is not a armstrong number");
        }
    }
}
