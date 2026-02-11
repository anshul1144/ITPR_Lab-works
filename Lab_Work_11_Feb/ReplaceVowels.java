// Replace All Vowels with Special Character
package Lab_Work_11_Feb;

import java.util.Scanner;

class ReplaceVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                
                result = result + "*";   // Replace vowel with *
            } else {
                result = result + ch;    // Keep consonant same
            }
        }

        System.out.println("After replacing vowels:");
        System.out.println(result);

        sc.close();
    }
}
