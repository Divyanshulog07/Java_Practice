import java.util.Scanner;
public class An_Maths_Class {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Maths Class
        System.out.println("Enter the two numbers a & b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(a, b));
        System.out.println(Math.min(a, b));

        // random function--> It gives values from 0.0 to 1.0
        System.out.println(Math.random());
        System.out.println((int)Math.random()); //-->It will give always 0 because it is in integer format
        System.out.println((int)(Math.random()*100)); //--> It will give random value above 1 because of *100 to integer value
    }
}
