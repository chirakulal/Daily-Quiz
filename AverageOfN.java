import java.util.Scanner;

public class AverageOfN {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =scanner.nextInt();
        int sum=0;
        int a;

        for (int i=0;i<n;i++){
            a=scanner.nextInt();
            sum=sum+a;
        }
        int avg=sum/n;

        System.out.println("Average of n is "+avg);

    }
}
