package April4;
import java.util.Scanner;
public class FindTypeOfURL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the website url");
        String url=sc.nextLine();//input website

        if(url.endsWith(".com"))
            System.out.println("Commercial Website");
        else if(url.endsWith(".org"))
            System.out.println("Organisational website");
        else if (url.endsWith(".in"))
            System.out.println("Indian website");

    }
}
