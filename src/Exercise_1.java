/*
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String[] args) {
        // Q1. Enter 3 numbers from the user & make a function to print their average.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("The average of given 3 numbers is: " + average);
    }
}
*/

/*
// Q2. Write a function to print the sum of all odd numbers from 1 to n.
import java.util.Scanner;
public class Exercise_1 {
    public static void sumOfOddNumbers(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (i % 2 == 1){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfOddNumbers(n);
    }
}
*/

/*
// Q3. Write a function to print the sum of all even numbers from 1 to n.
import java.util.Scanner;
public class Exercise_1 {
    public static void sumOfEvenNumber(int n){
        int sum = 0;
        for (int i=1; i<=n; i++){
            if (i % 2 == 0){
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.println("Enter your number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sumOfEvenNumber(n);
    }
}
*/

/*
// Q4. Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.Scanner;
public class Exercise_1 {
    public static double circumferenceOfCircle(double radius){
        double pi = 3.14;
        //double circumferenceOfCircle = 2*pi*radius;
        //return circumferenceOfCircle;
        return 2*pi*radius;
    }
    public static void main(String[] args) {
        System.out.println("Enter the Radius:");
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        //double circumferenceOfCircle = circumferenceOfCircle(r);
        //System.out.println(circumferenceOfCircle);
        System.out.println(circumferenceOfCircle(r));
    }
}
*/

/*
// Q5. Write a function that takes an age as input and returns if that person is eligible to vote or not. A person of age >= 18 is eligible to vote.
import java.util.Scanner;
public class Exercise_1 {
    public static boolean isEligible(int age){
        if (age>=18){
            System.out.println("You are eligible to vote.");
            return true;
        }else{
            System.out.println("You are not eligible to vote.");
            return false;
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println(isEligible(age));
    }
}
*/

/*
// Q6. Write a function which takes in 2 numbers and returns the greater of those two.
import java.util.Scanner;
public class Exercise_1 {
    public static int getGreater(int a, int b){
        if (a>b){
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The greater number is:"+getGreater(a, b));
    }
}
*/

/*
// Q7. Write an infinite loop using do while condition.
public class Exercise_1 {
    public static void main(String[] args) {
        do {
            System.out.println("Hello I am Divyanshu");
        }while (true);
    }
}
*/


// Q8. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String args[]) {
            int positive = 0, negative = 0, zeros = 0;
            System.out.print("Press 1 to continue & 0 to stop: ");
            Scanner sc = new Scanner(System.in);
            int input = sc.nextInt();
            while(input == 1) {
                System.out.println("Enter your number : ");
                int number = sc.nextInt();
                if(number > 0) {
                    positive++;
                } else if(number < 0) {
                    negative++;
                } else {
                    zeros++;
                }
                System.out.print("Press 1 to continue & 0 to stop: ");
                input = sc.nextInt();
            }
        System.out.println("Positives: "+ positive);
        System.out.println("Negatives: "+ negative);
        System.out.println("Zeros: "+ zeros);
    }
}


/*
// Q9. Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥^n.
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String args[]) {
        System.out.print("Enter x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int result = 1;
// Note: Please see that n is not too large or else result will exceed the size of int
        for(int i=0; i<n; i++) {
            result = result * x;
        }
        System.out.println("x to the power n is: "+ result);
    }
}
*/

/*
// Q10. Write a function that calculates the Greatest Common Divisor of 2 numbers.
import java.util.Scanner;
public class Exercise_1 {
public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter the two numbers:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        while(n1 != n2) {
            if(n1>n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        System.out.println("GCD is : "+ n2);
    }
}
*/

/*
// Q11. Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 .....In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// fibonacci series is the sequence, in which each number is the sum of the two preceding ones.
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get fibonacci series of that number:");
        int n = sc.nextInt();
        int a = 0, b = 1;
        System.out.print(a+" ");
        if(n > 1) {
//find nth term
            for(int i=2; i<=n; i++) {
                System.out.print(b+" ");
//the concept below is called swapping
                int temp = b;
                b = a + b;
                a = temp;
            }
            System.out.println();
        }
    }
}
*/
/*
import java.util.Scanner;
public class Exercise_1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i=0; i<n; i++ ){
            for (int j=0; j<m; j++){
                System.out.println("Hello Divyanshu");
            }
        }
    }
}
*/