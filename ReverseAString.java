import java.util.Scanner;

public class ReverseAString {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        for(int i=word.length()-1;i>=0;i--){
            char str = word.charAt(i);
            System.out.print(str);
        }
    }
}
