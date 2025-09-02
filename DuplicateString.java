import java.util.Scanner;

public class DuplicateString {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        char[] array = word.toCharArray();

        System.out.println("The duplicate elements are :");

        for(int i=0;i<array.length-1;i++){
            if(array[i]==array[i+1]){
                System.out.println(array[i]);
            }
        }
    }
}
