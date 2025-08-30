import java.util.Scanner;

public class Reverseeachword {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] words = word.split(" ");
        String result ="";

        for(String str :words){
            String rev ="";
            for(int i=str.length()-1;i>=0;i--){
                rev=rev+str.charAt(i);
            }
            result=result+rev+" ";
        }

        System.out.println(result);

    }
}
