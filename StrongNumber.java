import java.util.Scanner;

public class StrongNumber {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=scanner.nextInt();
        int sum=0;
        int org=num;
        while (num>0){
            int d=num%10;
            int fact=1;
            for(int i=1;i<=d;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            num=num/10;
        }
        if(org==sum){
            System.out.println("it is a Strong number");
        }else System.out.println("it is not a strong number");
    }
}
