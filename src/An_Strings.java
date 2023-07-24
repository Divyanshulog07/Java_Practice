// String is Non-Primitive data type
import java.util.Scanner;
import java.util.SortedMap;
public class An_Strings {
    public static void main(String[] args) {
        //Strings
        //(1) length -->Give the length of given string
        String name = "Divyanshu";
        System.out.println(name.length());

        // (2) concatenate -->do string ko jodna
        String name1 = "Divyanshu";
        String name2 = "Bansod";
        String name3 = name1 +" "+name2;
        System.out.println(name3);

        // (3) charAt -->It shows the character is present at which position from given string
        String Name1 = "Divyanshu";
        System.out.println(Name1.charAt(0));

        // (4) replace -->It replace the letter from given string
        String player = "Harry";
        String player2 = player.replace('r','p');
        System.out.println(player2);

        // (5) substring
        String str = "Divyanshu and Bansod";
        System.out.println(str.substring(14 , 20));

        // (6) Input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String Name = sc.nextLine();
        System.out.println("Your name is: "+ Name);

        // (7) print the all characters from string (name3) using charAt function
        for (int i=0; i<name3.length(); i++){
            System.out.println(name3.charAt(i));
        }

        // (8) Compare
        /* compareTo() function :
        This function has 3 possibilities and it returns :
        1) s1>s2 : +ve value
        2) s1==s2: 0
        3) s1<s2 : -ve value
        */
        System.out.println("Enter Your Names: ");
        String name4 = sc.next();
        String name5 = sc.next();
        if (name4.compareTo(name5)==0){
            System.out.println("Strings are Equal");
        } else{
            System.out.println("Strings are not Equal");
        }
    }
}
 