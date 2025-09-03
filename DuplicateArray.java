import java.util.Scanner;

public class DuplicateArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Duplicate elements:");
        for (int i = 0; i < array.length; i++) {
            boolean alreadyPrinted = false;


            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }


            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.print(array[i] + " ");
                    break; // print only once
                }
            }
        }
    }
}


