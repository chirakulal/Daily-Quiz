import java.util.Scanner;

public class swapNumbers {

    public static void swap(int a,int b){

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("swaped numbers are: "+ a +" "+b);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        swap(a,b);

    }
}
