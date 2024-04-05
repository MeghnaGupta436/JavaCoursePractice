package April3;
import java.util.Scanner;
public class InputFromUser {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        //sc is object of class Scanner and system.in means that we need to read from keyboard
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number");
        //Scanner class has many methods to read from keyboard
        int a= sc.nextInt();//reading integer value from keyboard

        System.out.println("Enter any number");
        /* to use method hasNextInt()which checks that the user has entered integer value or not.
        there are many other methods such as hasNextFloat(),hasNextLine() etc */
        boolean b=sc.hasNextInt();//boolean will save result in true or false
        System.out.println(b);//displaying the boolean result

        //input a string in java
        //next() only reads a word until the space is encountered and after that it will skip
        //to input whole string with more words we use nextLine() method
        System.out.println("Enter a string");
        String str=sc.nextLine();//this method is used to input a string
        System.out.println(str);

    }
}
