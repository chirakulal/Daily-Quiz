import java.util.Scanner;

public class CountOfOccurenceOfCharacter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        word = word.replace(" ","");

        int[] count = new int[256];
        for(int i=0;i<word.length();i++){
           count[word.charAt(i)]++;

        }
        System.out.println("Character occurence");

        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                System.out.println((char) i + " → " + count[i]);
            }
        }
    }
}
