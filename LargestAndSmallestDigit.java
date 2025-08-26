import java.util.Scanner;

public class LargestAndSmallestDigit {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num = scanner.nextInt();
        int largest=0, smallest=9;
        while(num>0){
            int d= num%10;

            if(largest<d){
                largest=d;
            }else if(smallest>d){
                smallest=d;
            }
            num=num/10;
        }

        System.out.println("Largest digit in number "+largest);
        System.out.println("Smallest digit in number "+smallest);
    }
}
