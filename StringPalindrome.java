import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        boolean isPalindrome = true;

        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome)
            System.out.println(word + " is a Palindrome");
        else
            System.out.println(word + " is NOT a Palindrome");
    }

    }

