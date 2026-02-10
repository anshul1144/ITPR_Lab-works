// Program to display all prime numbers between 1 and 100
class PrimeNumber {

    // Main method: program execution starts here
    public static void main(String[] args) {

        int i, j; // Loop variables

        // Print heading message
        System.out.println("Prime numbers between 1 to 100 are:");

        // Outer loop to check numbers from 2 to 100
        for (i = 2; i <= 100; i++) {

            // Variable to count the number of factors of i
            int count = 0;

            // Inner loop to check divisibility of i
            for (j = 1; j <= i; j++) {

                // If j divides i completely, increment count
                if (i % j == 0) {
                    count++;
                }
            }

            // A number is prime if it has exactly two factors (1 and itself)
            if (count == 2) {

                // Print the prime number
                System.out.print(i + " ");
            }
        }
    }
}
