package April4;
import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of students in 3 subjects");
        int sub1=sc.nextInt();
        int sub2=sc.nextInt();
        int sub3=sc.nextInt();

        float sum=sub1+sub2+sub3;
        float totalPercentage=(sum/300)*100;//percentage

        if(sub1>=33 && sub2>=33 && sub3>=33){
            if(totalPercentage>40)
                System.out.println("You Passed");}
        else
            System.out.println("You Failed ");


    }
}
