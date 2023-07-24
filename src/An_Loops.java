import java.util.Scanner;

public class An_Loops {
    public static void main(String[] args) {
        /*
        // For Loop
        System.out.println("Numbers for for loop");
        for (int i= 1; i<= 100; i++) {
            System.out.println(i);
        }
        // While Loop
        System.out.println("Numbers for while loop");
        int i = 100;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }
        // Do While Loop
        System.out.println("Numbers for do while loop");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        }while (j<=50);
        */

        /*
        //Exercise on loop
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("User!"  +  "Please Input your Number");
            number = sc.nextInt();
            System.out.print("Here is your number: ");
            System.out.println(number);
        }while (number>=0);
        System.out.println("The End");
        */

        /*
        // Factorial
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc1.nextInt();
        int factorial = 1;
        for (int i=1;i<=n;i++){
            factorial=factorial*i;
        }
        System.out.println("The factorial is: "+ factorial);
        */

        ///*
        // Write a program to calculate the sum of the numbers occurring in the multiplication table.
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc2.nextInt();
        int sum=0;
        System.out.println("The multiplication of given number is: ");
        for (int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",n ,i ,n*i);
            sum=sum+(n*i);
        }
        System.out.println("The sum of the numbers occurring in the multiplication table is: "+sum);
    }
}
