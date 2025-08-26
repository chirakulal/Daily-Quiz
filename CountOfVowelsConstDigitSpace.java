import java.util.Scanner;

public class CountOfVowelsConstDigitSpace {


    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        String str = scanner.nextLine();

        int vowels=0,constant=0,digits=0,space=0;
        str=str.toLowerCase();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            if(ch >= 'a' && ch<='z'){
                if(ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e'){
                    vowels++;
                }else {
                    constant++;
                }
            }else if (ch>='0'&&ch<='9'){
                digits++;
            }else if(ch==' '){
                space++;
            }
        }

        System.out.println("Vowels :"+vowels);
        System.out.println("Constants :"+constant);
        System.out.println("Digits :"+digits);
        System.out.println("Space "+space);
    }
}
