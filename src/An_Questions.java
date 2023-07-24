import java.util.*;
public class An_Questions {
    public static void main(String[] args) {
        // Q1. Print the sum of n natural numbers.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the natural number");
        int n = sc.nextInt();
        int sum = 0;
        for (int i=0; i<=n; i++){
            sum = sum+i;
        }
        System.out.println(sum);

        // Q2. Print the table of a number input by the user.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the number");
        int N = sc1.nextInt();
        for (int i=1; i<=10; i++){
            System.out.println(N*i);
        }
    }
}
