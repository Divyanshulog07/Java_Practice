import java.util.Scanner;

public class An_2D_Arrays {
    public static void main(String[] args) {
        // 2-D Array
        int[][] marks2 = {{80, 82, 84} , {70, 72, 74}};
        System.out.println(marks2[0][1]);
        System.out.println(marks2[1][2]);

        /*
        // 2-D Array from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Rows and columns: ");
        int rows = sc.nextInt();
        int colm = sc.nextInt();

        System.out.println("Enter the numbers of Rows and columns: ");
        int[][] numbers = new int[rows][colm];

        //for input
        //rows
        for (int i=0; i<rows; i++){
            //columns
            for (int j=0; j<colm; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //for output
        System.out.println("The given Matrix is: ");
        for (int i=0; i<rows; i++){
            for (int j=0; j<colm; j++){
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
        */

        // Take a matrix as a input from the user. Search or a given number x and print the indices at which it occurs.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Rows and columns: ");
        int rows = sc.nextInt();
        int colm = sc.nextInt();

        System.out.println("Enter the numbers of Rows and columns: ");
        int[][] numbers = new int[rows][colm];

        //for input
        //rows
        for (int i=0; i<rows; i++){
            //columns
            for (int j=0; j<colm; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        //for output
        for (int i=0; i<rows; i++){
            for (int j=0; j<colm; j++){
                //compare with x
                if (numbers[i][j] == x){
                    System.out.println("x is found at indices:" + i +" "+ j);
                }
            }
        }
    }
}
