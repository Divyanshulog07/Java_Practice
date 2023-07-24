/*
// Print the name from user.
import java.util.Scanner;
public class An_Functions {
    public static void printMyName(String name){ //---> In java we will write the function in camel case(printMyName)
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        printMyName(name); //--->This line call the function
    }
}
*/

/*
// Make a function to add 2 numbers and return the sum.
import java.util.Scanner;
public class An_Functions {
    public static int calculateMySum(int a, int b){
        //int sum = a+b;
        //return sum;
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //int sum = calculateMySum(a, b);
        //System.out.println(sum);
        System.out.println(calculateMySum(a , b));
    }
}
*/

/*
// Make a function to multiply 2 numbers and return the product.
import java.util.Scanner;
public class An_Functions {
    public static void calculateMyProduct(int a, int b){
        System.out.println(a*b);
    }
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calculateMyProduct(a , b);
    }
}
*/

/*
// Find the factorial of a number using iterative method.
import java.util.Scanner;
public class An_Functions {
    public static void printMyFactorial(int a){
        if (a < 0){
            System.out.println("It is an invalid number");
            return;
        }
        int factorial = 1;
        for (int i=a; i>=1; i--){
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        printMyFactorial(a);
    }
}
*/
/*
// Find the factorial of a number using Recursion Method.
// factorial(n) = n*factorial(n-1) --> formula for factorial.
import java.util.Scanner;
public class An_Functions {
    public static int factorial(int n){
       if(n==0 || n==1){
           return 1;
       }else{
           return n*factorial(n-1);
       }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("The value of factorial " + n + " is: "+ factorial(n));
    }
}
/*
/*
// Write a program to print Fibonacci series of n terms where n is input by user : 0 1 1 2 3 5 8 13 21 ...using Recursive method.
import java.util.Scanner;
public class An_Functions {
    public static int fib(int n){
        if(n==1 || n==2){
            return n-1;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.print("The given number: "+ n +"th Fibonacci series is: ");
        System.out.println(fib(n));
    }
}
*/