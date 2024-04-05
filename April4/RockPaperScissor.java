package April4;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int Wincounter=0;

        System.out.println("\"ROCK-PAPER-SCISSORS\"\n" +
                "---------------------\n"+
                "1-Rock\n" +
                "2-Paper\n" +
                "3-Scissors");

        for(int i=1;i<=3;i++){
            System.out.println("---------------------");
            System.out.println("\"Round"+i+"\"");
            int choice1=random.nextInt(1,4);

            System.out.println("Enter your choice");
            int choice2=sc.nextInt();//input choice

            switch(choice1){
                case 1:if(choice2==2){
                    Wincounter++;
                    System.out.println("You Won");}
                    else if(choice2==3)
                    System.out.println("You Lost");
                    else {System.out.println("Draw! Play again");
                    i--;};
                    break;
                case 2: if(choice2==3){Wincounter++;
                    System.out.println("You Won");}
                    else if(choice2==1)
                    System.out.println("You Lost");
                else {System.out.println("Draw! Play again");
                    i--;};
                    break;
                case 3:if(choice2==1){Wincounter++;
                    System.out.println("You Won");}
                    else if(choice2==2)
                    System.out.println("You Lost");
                else {System.out.println("Draw! Play again");
                    i--;};
                    break;
                default:
                    System.out.println("Enter a valid choice");
            }
        }
        System.out.println("-------" +
                "FINAL RESULT" +
                "-------");
        if(Wincounter>1)
            System.out.println("YOU WON");
        else
            System.out.println("YOU LOST");
        System.out.println("------------------------");
    }
}
