import java.util.Scanner;

public class CountNumberOfWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();

      String []  word = words.trim().split("\\s+");

      int count = word.length;

        System.out.println("The String :"+words);
        System.out.println("The number of count :"+count);
    }
}
