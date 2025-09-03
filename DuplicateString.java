import java.util.Scanner;

public class DuplicateString {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] array = word.toCharArray();

        System.out.println("The duplicate elements are :");

        for(int i=0;i<array.length;i++){
            for(int j=1;j<array.length;j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break;
                }
            }
        }
    }
}
