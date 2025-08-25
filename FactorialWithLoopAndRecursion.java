import java.util.Scanner;

public class FactorialWithLoopAndRecursion {

//    public static int factorial(int num){
//        int fact =1;
//
//        if(num<0){
//            System.out.println("Factorial is not defined for negative number");
//        }
//
//
//        for(int i=1;i<=num;i++){
//            fact =fact*i;
//        }
//
//        return fact;
//    }

    public static int factorial(int num){
        if(num<0){
            throw new IllegalArgumentException("Factorial is not defined for negative number");
        }

        if(num==0||num==1){
            return 1;
        }

        return num*factorial(num-1);
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int  num = scanner.nextInt();

        System.out.println("factorial of "+num+" is "+factorial(num));
    }
}
