package April4;
import java.util.Scanner;
public class CovertToLowerCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//object created

        System.out.println("Enter a string");
        String str=sc.nextLine();//input string

        //function used to convert the string to lower case
        System.out.println(str.toLowerCase());

    }
}
