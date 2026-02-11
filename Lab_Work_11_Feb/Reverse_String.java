// Reverse a String (Without using inbuilt reverse method)
package Lab_Work_11_Feb;

import java.util.Scanner;

class Reverse_String {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        String reversed = "";

        // Loop from last character to first
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }

        System.out.println("Reversed String: " + reversed);

        sc.close();
    }
}
