package Level1Que;

public class Reverse {
    static int sum = 0; // will hold the reversed number as each digit is processed.

    static int rev(int n) {
        if (n == 0) {
            return 0;
        }

        int rem = n % 10; // Last digit
        sum = sum * 10 + rem;
        return rev(n / 10); // process continues until n is 0, at which point the recursion stops.
    }

    public static void main(String[] args) {
        int reversedNumber = rev(5678); // Store the result of the reversal
        System.out.println(sum); // Print the reversed number
    }
}
