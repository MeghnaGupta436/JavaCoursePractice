package April3;
import java.util.Scanner;
public class OperatorPrecedenceInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //precedence is order of operators evaluated first
        //associativity is order in which evaluation would take place(left to right or vice versa)
        //associativity is the order to evaluate where precedence of operators is equal

        int a = 6 * 5 - 34 / 2;//here the precedence is *,/,-
        System.out.println(a);

        int b=60/5-34*2;//associativity is checked
        System.out.println(b);

        int c=1,x=9,y=3;
        System.out.println(x-y/2);//using parenthesis  to make it understandable
        System.out.println(b*b-(4*a*c)/2*a);
    }
}
