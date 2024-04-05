package April3;
import java.util.Scanner;
public class CalculatePercentage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int sub1,sub2,sub3,sub4,sub5;
        float sum,percentage;
        System.out.println("Enter your marks in 5 subjects out of 100 in each");

        //reading input entered by user
        sub1=sc.nextInt();
        sub2=sc.nextInt();
        sub3=sc.nextInt();
        sub4=sc.nextInt();
        sub5=sc.nextInt();

        //to find percentage of a student based on 5 subjects
        sum=sub1+sub2+sub3+sub4+sub5;//sum of marks of 5 subjects
        percentage=(sum/500)*100; //finding the percentage

        //displaying the percentage
        System.out.println("The percentage is: "+percentage);
    }
}
