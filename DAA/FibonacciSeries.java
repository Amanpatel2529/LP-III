package DAA;

import java.util.*;

// by recursive approach
public class FibonacciSeries {

    public static int generateFibo(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1 || n == 2) {
            return 1;
        }
        return generateFibo(n - 1) + generateFibo(n - 2);

    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n :");
        int n = sc.nextInt();

        generateFibo(n);

        for (int i = 0; i < n; i++) {
            System.out.println(generateFibo(i) + " ");
        }
        sc.close();
    }
}