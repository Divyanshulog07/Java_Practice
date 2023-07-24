import java.util.Scanner;
public class An_Inputs_In_Java {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);


        // For string inputs
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String Name = sc1.next(); //-->next() only gives a single word
        System.out.println(Name);

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your Sentence: ");
        String name = sc2.nextLine(); //-->nextLine() gives a whole sentence
        System.out.println(name);
    }
}
