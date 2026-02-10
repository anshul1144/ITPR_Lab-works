// Class to generate Fibonacci series using recursion
class FibonacciRecursion {

    // Static method to calculate Fibonacci number for a given position n
    static long fibonacci(int n) {

        // Base case: if n is 0, return 0
        if (n == 0)
            return 0;

        // Base case: if n is 1, return 1
        if (n == 1)
            return 1;

        // Recursive call: sum of previous two Fibonacci numbers
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Main method: program execution starts here
    public static void main(String[] args) {

        // Number of terms to be displayed
        int terms = 30;

        // Print heading message
        System.out.println("Fibonacci Series till 30 terms:");

        // Loop to print Fibonacci series up to the given number of terms
        for (int i = 0; i < terms; i++) {

            // Call fibonacci method and print each term
            System.out.print(fibonacci(i) + " ");
        }
    } 
}
