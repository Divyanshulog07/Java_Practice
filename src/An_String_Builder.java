public class An_String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);

        // char at index -->shows the positions of char at any index
        System.out.println(sb.charAt(1));

        // set char at index --> Remove the char from any index with another char
        sb.setCharAt(0,'C');
        System.out.println(sb);

        // insert --> Add the char at any index
        sb.insert(5,'s');
        System.out.println(sb);

        // delete --> Delete the char
        sb.delete(5,6);
        System.out.println(sb);

        // append --> Add the char at last index of String
        StringBuilder sb1 = new StringBuilder("H");
        sb1.append("a");
        sb1.append("p");
        sb1.append("p");
        sb1.append("y");
        System.out.println(sb1);

        // Reverse the String
        StringBuilder sb2 = new StringBuilder("Happy");
        for (int i=0; i<sb2.length()/2; i++){
            // For index calculation
            int front = i;
            int back = sb.length()-i-1;
            // For char calculation at front and back index
            char frontChar = sb2.charAt(front);
            char backChar = sb2.charAt(back);
        // setCharAt --> It sets the char
            /*
            for ex. => front(index) - backChar(Char)
                    => back(index) - frontChar(Char)
            */
            sb2.setCharAt(front, backChar);
            sb2.setCharAt(back, frontChar);
        }
        System.out.print("The Reverse String is: " +sb2);
    }
}
