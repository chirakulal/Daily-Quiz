import java.util.Scanner;

public class LargestSmallestInArray {



        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<arr.length;i++){
                arr[i] = scanner.nextInt();
            }

            int min = arr[0], max = arr[0];
            for (int num : arr) {
                if (num < min) min = num;
                if (num > max) max = num;
            }

            System.out.println("Smallest: " + min);
            System.out.println("Largest: " + max);
        }
    }


