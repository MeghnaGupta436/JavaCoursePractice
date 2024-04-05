package April3;
import java.util.Scanner;
public class OperatorsInJava {
    public static void main(String[] args) {
        int a=18,b=4,c=0;
        int d=0,e=70,f=45,g=60;
        //arithmetic operators(don't work on boolean)
        System.out.println(a+b);//addition
        System.out.println(a-b);//subtraction
        System.out.println(a*b);//multiplication
        System.out.println(a/b);//division
        System.out.println(a%b);//modulus
        System.out.println(4.8%1.1);
        System.out.println(++a);//pre increment
        System.out.println(a++);//post increment

        //assignment operators
        c=50;//assigned 50 value to c
        System.out.println(c);
        d+=c;//d is assigned a value d+c
        System.out.println(d);
        e-=d;//e is assigned e-d;
        System.out.println(e);
        f*=d;//f=f*d
        System.out.println(f);
        g/=a;//g=g/a

        //comparision operator
        System.out.println(a==b);//equal to operator
        System.out.println(c==d);
        System.out.println(a<b);//less than
        System.out.println(c>=d);//greater than

        //logical operator
        System.out.println(a>b && c>d);//and(&) operator
        System.out.println(a>b || c>d);//or(|) operator
        System.out.println(a!=10);// not operator

        //bitwize operators
        System.out.println(2&4);

        //increment or decrement operators in Java
        int m=4,n=7;
        System.out.println(m++);//post increment
        System.out.println(m);
//        System.out.println(--n);//pre increment
//        System.out.println(n);
        int z= ++n*8;
        System.out.println(z);
    }
}
