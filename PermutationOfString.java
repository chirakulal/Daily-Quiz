import java.util.Scanner;

public class PermutationOfString {


        private static void generatePermutations(String str, String result) {
            if (str.isEmpty()) {
                System.out.println(result);
                return;
            }

            for (int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);


                String remaining = str.substring(0, i) + str.substring(i + 1);


                generatePermutations(remaining, result + ch);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            System.out.println("Permutations of " + input + " are:");
            generatePermutations(input, "");
        }
    }

