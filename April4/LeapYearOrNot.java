package April4;
import java.util.Scanner;
public class LeapYearOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a year");
        int year=sc.nextInt();//year entered

        if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
             System.out.println("Entered year is a leap year");}
        else
            {System.out.println("Entered year is not leap year");}
    }
}
