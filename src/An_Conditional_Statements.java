import java.util.Scanner;
public class An_Conditional_Statements {
    public static void main(String[] args) {

        //if else statements

       Scanner sc = new Scanner(System.in);
       System.out.println("Enter your age: ");
        int age = sc.nextInt();
        if(age >= 18)
            System.out.println("you can vote");
        else
            System.out.println("you can't vote");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the true or false: ");
        boolean isSunUp = sc1.nextBoolean();
        if(isSunUp == true)
            System.out.println("There is an Day");
        else
            System.out.println("There is an Night");

        //Example on conditional statements
        Scanner sc2 = new Scanner(System.in);
        System.out.println("How many rupees you have: ");
        int Rupees = sc2.nextInt();
        if(Rupees<10)
            System.out.println("You can not buy Anything");
        else if(Rupees>=10 && Rupees<40)
            System.out.println("You can buy only Pen");
        else
            System.out.println("You can buy both Pen and NoteBook");

        // Switch Statements
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter the Day: ");
        int Day = sc3.nextInt();
        switch (Day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Sunday");
        }
    }
}
