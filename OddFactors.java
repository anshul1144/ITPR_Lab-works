// Write a program to display only odd factors of the given number

import java.util.Scanner;

class OddFactors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Odd factors of " + num + " are:");

        for (int i = 1; i <= num; i++) {

            // Check if i is a factor and also odd
            if (num % i == 0 && i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();
    }
}
