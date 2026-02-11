// Count Occurrence of Each Character
package Lab_Work_11_Feb;

import java.util.Scanner;

class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Convert string to lowercase (optional)
        str = str.toLowerCase();

        // Convert string into character array
        char[] ch = str.toCharArray();

        System.out.println("Character occurrences are:");

        for (int i = 0; i < ch.length; i++) {

            int count = 1;

            // Skip if character is already counted
            if (ch[i] == '0')
                continue;

            for (int j = i + 1; j < ch.length; j++) {

                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0';   // Mark as counted
                }
            }

            if (ch[i] != '0')
                System.out.println(ch[i] + " : " + count);
        }

        sc.close();
    }
}

