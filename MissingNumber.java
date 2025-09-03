import java.util.Scanner;

public class MissingNumber {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n - 1];


        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int sum = n * (n + 1) / 2;  // expected sum of 1..n
        int arrSum = 0;

        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int missing = sum - arrSum;
        System.out.println("Missing number is: " + missing);
    }
}


