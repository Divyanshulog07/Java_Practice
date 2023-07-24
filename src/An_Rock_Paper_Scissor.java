// Rock_Paper_Scissor_Game
import java.util.Scanner;
import java.util.Random;
public class An_Rock_Paper_Scissor {
    public static void main(String[] args) {
        // 0 for Rock
        // 1 for Paper
        // 2 for scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for scissor");
        int userInput = sc.nextInt();

        Random random = new Random();
        int computerInput = random.nextInt(3);

        System.out.print("The Result is: ");

        if (userInput==computerInput){
            System.out.println("Draw");
        } else if (userInput==0 && computerInput==2 || userInput==1 && computerInput==0 || userInput==2 && computerInput==1){
            System.out.println("You Win!, Computer loose");
        }else{
            System.out.println("You loose, Computer Win!");
        }

        if (userInput==0){
            System.out.println("User Choice is: " + userInput + " (Rock)" );
        } else if (userInput==1){
            System.out.println("User Choice is: " + userInput + " (Paper)" );
        }else{
            System.out.println("User Choice is: " + userInput + " (Scissor)" );
        }

        if (computerInput==0){
            System.out.println("Computer Choice is: " + computerInput + " (Rock)" );
        } else if (computerInput==1){
            System.out.println("Computer Choice is: " + computerInput + " (Paper)" );
        }else{
            System.out.println("Computer Choice is: " + computerInput + " (Scissor)" );
        }
    }
}
