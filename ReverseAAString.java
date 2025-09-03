import java.util.Scanner;

public class ReverseAAString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word= scanner.nextLine();
        char[] str = word.toCharArray();
        String rev = "";

        for (int i = str.length - 1; i >= 0; i--) {
            rev += str[i];  // appending characters in reverse order
        }


        System.out.println("Reversed: " + rev);
    }
}
