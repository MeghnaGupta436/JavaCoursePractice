package April3;
import java.util.Scanner;
public class StartingString {
    public static void main(String[] args) {

        //to declare a string we use 'new' keyword and is immutable(can't be changed)
        String name="Harry";//one way to create a string
        String str=new String("Meghna Gupta");
        System.out.println(name+" "+str);//displaying string

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string1");
        String str1=sc.next();//using next will only take 1st word till space as a string
        System.out.println(str1);//displaying the string entered using next() method

        System.out.println("Enter string 2");
        String str2=sc.nextLine();//nextLine() takes all the words entered as a string
        System.out.println(str2);//displaying the string using nextLine() method

    }
}
