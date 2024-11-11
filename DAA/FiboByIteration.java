package DAA;

import java.util.*;

public class FibonacciSeries {

    public static int generateFibo(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        int a = 0, b = 1, fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = a + b; // Calculate the next Fibonacci number
            a = b; // Shift `a` to the next position
            b = fib; // Shift `b` to the next position
        }
        return fib;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n :");
        int n = sc.nextInt();

        // Print the Fibonacci series up to n terms iteratively
        System.out.print("Fibonacci series: ");
        for (int i = 0; i < n; i++) {
            System.out.print(generateFibo(i) + " ");
        }
        sc.close();
    }
}
