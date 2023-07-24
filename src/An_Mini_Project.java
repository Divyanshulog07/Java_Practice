import java.util.Scanner;
public class An_Mini_Project {
    public static void main(String[] args) {
        // We can generate a Random number and user can find it.
        Scanner sc = new Scanner(System.in);
        int username = 0;
        int my_number = (int)(Math.random()*100);
        do {
            System.out.print("Guess My Number(1-100): ");
            username = sc.nextInt();
            if (username == my_number){
                System.out.println("wohoooo..! Correct number");
                break;
            }
            else if (username > my_number){
                System.out.println("your number is too large");
            }
            else{
                System.out.println("your number is too small");
            }
        }while (username >= 0);
        System.out.print("My number was: ");
        System.out.println(my_number);
    }
}
