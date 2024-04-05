package April4;
import java.util.Scanner;
public class CalculateIncomeTax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your salary");
        float salary=sc.nextInt();//input salary

        float tax=0;
        if(salary <250000)
            tax=tax+0;
        else if(salary>=250000 && salary< 500000)
            tax=(float)(salary*0.05);
        else if(salary>=500000 && salary<1000000)
            tax=(float)(salary*0.2);
        else if(salary>=1000000)
            tax=(float)(salary*0.3);

        System.out.println("You have to pay the tax amount of: "+tax);
    }
}
