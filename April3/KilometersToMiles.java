package April3;
import java.util.Scanner;
public class KilometersToMiles {
    public static void main(String[] args) {
        //1 mile =1.60934 kilometers (km)
        //1 km=0.621371 miles (mi)

        System.out.println("Enter the distance in kilometres");
        Scanner sc=new Scanner(System.in);//created object of scanner class
        float km=sc.nextFloat();//taking distance in km from user

        float mi=(float)(km*0.621371);//converting km to miles
        System.out.println("Entered distance in miles is: "+mi+" miles");
    }
}
