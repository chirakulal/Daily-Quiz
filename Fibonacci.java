import java.util.Scanner;

public class Fibonacci {
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           int num =scanner.nextInt();

        for (int i = 0; i < num; i++) {
            System.out.print(fib(i) + " ");
        }

        System.out.println(" ");
           int n1=0;
           int n2=1;
           int sum=0;
        System.out.print(n1+" "+n2);
           for(int i=2;i<num;i++){
               sum=n2+n1;
               System.out.print(" "+sum);
               n1=n2;
               n2=sum;
           }

    }
}
