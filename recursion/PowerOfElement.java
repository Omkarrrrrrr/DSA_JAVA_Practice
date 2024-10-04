import java.io.*;
import java.math.BigInteger;  // Import BigInteger class
import java.util.Scanner;

public class PowerOfElement {

    // Function to calculate power using recursion
    public static BigInteger powerFind(BigInteger a, int b) {
        // Base case: when the exponent is 1, return the base
        if (b == 1) {
            return a;
        }

        // Recursive case: divide the exponent by 2
        int mid = b / 2;
        BigInteger result = powerFind(a, mid);
        BigInteger finalResult = result.multiply(result);  // result * result     multiply() used for bigintegers

        // If the exponent is even
        if (b % 2 == 0) {
            return finalResult;
        }
        // If the exponent is odd, multiply by 'a' once more
        else {
            return a.multiply(finalResult);
        }
    }

    public static void main(String[] args) {
        // Scanner to take user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base (a) and exponent (b): ");
        
        // Input base and exponent
        BigInteger a = sc.nextBigInteger();  // Take BigInteger input for base
        int b = sc.nextInt();  // Take integer input for exponent

        // Call the recursive power function
        BigInteger result = powerFind(a, b);

        // Display the result
        System.out.println(a + "^" + b + " is " + result);
    }
}


// Time Complexity: O(log b)