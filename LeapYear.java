import java.util.Scanner;

public class LeapYear {

    public static boolean leapyear(int year){
        if(year%400==0){
            return true;
        }else if(year%100!=0 && year%4==0){
            return true;
        }

        return false;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();

        if(leapyear(year)){
            System.out.println("It is a leap year");
        }else System.out.println("it is not a leap year");
    }
}
