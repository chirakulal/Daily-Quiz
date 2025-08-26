import java.util.Scanner;

public class GCDAndLCM {

    public static int find(int a,int b){
        while (b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a =scanner.nextInt();
        int b= scanner.nextInt();

        int gcd = find(a,b);

        int lcm=(a*b)/gcd;

        System.out.println("gcd "+gcd);
        System.out.println("lcm "+lcm);
    }
}
