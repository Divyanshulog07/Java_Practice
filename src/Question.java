import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        // Q1. Addition of Two Numbers by 3 different methods
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a two Numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition of two numbers is: "); //-->by 1st method
        System.out.println(a+b);

        //-->by 2nd method
        while(a>0) {
            a--;
            b++;
        }
        System.out.println(b);

        //-->by 3rd method
        System.out.println(Math.log(Math.exp(a)*Math.exp(b)));

        // Q2. Write a program to calculate percentage of a given student in bard exam. his marks from 5 subjects must be taken as input from the keyboard. Also take the total arks from user.
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the total marks");
        float total = sc1.nextInt();
        System.out.println("Enter the total number of subject");
        float noOfTotalSubject = sc1.nextInt();
        System.out.println("Enter the marks of subjects");
        float English = sc1.nextInt();
        float Marathi = sc1.nextInt();
        float Chemistry = sc1.nextInt();
        System.out.println("The sum of all subject is");
        float sumOfAllSubject = English + Marathi + Chemistry;
        System.out.println(sumOfAllSubject);
        System.out.println("Average of all Subject is");
        float avg = sumOfAllSubject/total;
        System.out.println(avg);
        System.out.println("The percentage of all subject is");
        float percentage = avg*100;
        System.out.println(percentage+"%");

        // Q3. Conversion of kilometers in miles
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Distance in Kilometers: ");
        float km = sc2.nextFloat();
        //Kilometers to miles conversion
        float miles = km * 0.6213711922f;
        System.out.println("Distance in miles will be: "+miles);

    }
}
