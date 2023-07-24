public class An_Patterns {
    public static void main(String[] args) {
        /* Nested Loops
        //outer loops
        for(){
            //inner loops
            for(){
        }
        */

        /*
        Q1. Solid rectangle.
        *****
        *****
        *****
        *****
        */
        int m = 4;
        int n = 5;
        System.out.println("Solid Rectangle:");
        for (int i=1; i<=m; i++) {
            for (int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Q2. Hollow rectangle.
        *****
        *   *
        *   *
        *****
        */
        int a = 4;
        int b = 5;
        System.out.println("Hollow Rectangle:");
        for (int i=1; i<=a; i++){
            for (int j=1; j<=b; j++){
                if (i==1 || j==1 || i==a || j==b){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /*
        Q3. Half Pyramid.
        *
        **
        ***
        ****
        */
        int c = 4;
        System.out.println("Half Pyramid:");
        for (int i=1; i<=c; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Q4. Inverted Half Pyramid.
        ****
        ***
        **
        *
        */
        int d = 4;
        System.out.println("Inverted Half Pyramid:");
        for (int i=d; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Q5. Inverted Half Pyramid.(rotated by 180 degree)
           *
          **
         ***
        ****
        */
        int e = 4;
        System.out.println("Inverted Half Pyramid.(rotated by 180 degree:");
        for (int i=1; i<=e; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
           for (int j=1; j<=i; j++){
               System.out.print("*");
           }
            System.out.println();
        }

        /*
        Q6. Half Pyramid with numbers.
        1
        1 2
        1 2 3
        1 2 3 4
        1 2 3 4 5
        */
        int f = 5;
        System.out.println("Half Pyramid with numbers:");
        for (int i=1; i<=f; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

        /*
        Q7. Inverted Half Pyramid with numbers.
        1 2 3 4 5
        1 2 3 4
        1 2 3
        1 2
        1
        */
        int g = 5;
        System.out.println("Inverted Half Pyramid with numbers:");
        for (int i=1; i<=g; i++){
            for (int j=1; j<=g-i+1; j++){   // we can also solve this problem by decrement the Q5.
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
        Q8. Floyd's Triangle.
        1
        2 3
        3 5 6
        7 9 9 10
        11 12 13 14 15
        */
        int h=5;
        int num=1;
        System.out.println("Floyd's Triangle:");
        for (int i=1; i<=h; i++){
            for (int j=1; j<=i; j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }

        /*
        Q9. 0-1 Triangle.
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        */
        int k=5;
        System.out.println("0-1 Triangle:");
        for (int i=1; i<=k; i++){
            for (int j=1; j<=i; j++){
                int sum=i+j;
                if (sum % 2 == 0){
                    System.out.print("1 "); //-->Even
                }else {
                    System.out.print("0 "); //-->Odd
                }
            }
            System.out.println();
        }

        /*
        Q10. Diamond.
           *
          ***
         *****
        *******
        *******
         *****
          ***
           *
        */
        int l=4;
        System.out.println("Diamond:");
        for (int i=1; i<=l; i++){
            for (int j=1; j<=l-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=l; i>=1; i--){
            for (int j=1; j<=l-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Q11. Butterfly.
        *        *
        **      **
        ***    ***
        ****  ****
        **********
        **********
        ****  ****
        ***    ***
        **      **
        *        *
        */
        int o=5;
        System.out.println("Butterfly:");
        for(int i=1; i<=o; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=o; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Q12. Solid Rhombus.
             *****
            *****
           *****
          *****
         *****
         */
        int p=5;
        System.out.println("Solid Rhombus:");
        for (int i=1; i<=p; i++){
            for (int j=1; j<=(p-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=p; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        /*
        Q13. Number Pyramid.
            1
           2 2
          3 3 3
         4 4 4 4
        5 5 5 5 5
        */
        int q=5;
        System.out.println("Number Pyramid:");
        for (int i=1; i<=q; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        /*
        Q14. Number Palindrome --->dono bhi trf se same dikhe. (ex. BOB, 101, eye)
            1
           212
          32123
         4321234
        543212345
        */
        int r=5;
        System.out.println("Number Palindrome:");
        for (int i=1; i<=r; i++){
            for (int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for (int j=i; j>=1; j--){
                System.out.print(j);
            }
            for (int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        /*
        Q15. Hollow Rhombus.
             *****
            *   *
           *   *
          *   *
         *****
        */
        int s=5;
        System.out.println("Hollow Rhombus:");
        for (int i=1; i<=s; i++){
            for (int j=1; j<=(s-i); j++){
                System.out.print(" ");
            }
            for (int j=1; j<=s; j++){
                if (i==1 || j==1 || i==s || j==s){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        /*
        Q16. Hollow Diamond.
           *
          * *
         *   *
        *     *
         *   *
          * *
           *
        */
        int t=4;
        System.out.println("Hollow Diamond:");
        for (int i=1; i<=t; i++){
            for (int j=1; j<=t-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                if (j==1 || j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i=t; i>=1; i--){
            for (int j=1; j<=t-i; j++){
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1;j++){
                if (j==1 || j==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}