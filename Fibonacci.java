import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
           int num =scanner.nextInt();

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
