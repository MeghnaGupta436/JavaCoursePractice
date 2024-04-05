package April3;
import java.util.Scanner;
public class NumberIsIntegerOrNot {
    public static void main(String[] args) {

        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);//Scanner object created

        //checking if the entered number is integer or not
        System.out.println(sc.hasNextInt());
    }
}
