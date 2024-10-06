package Level1Que;

import java.util.Scanner;

public class ProductDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int n = sc.nextInt();

        int result = prod(n);
        System.out.println("The product of digits is : " + result);
    }

    private static int prod(int n) {
        if (n % 10 == n) {
            return n;
        } else {
            return prod(n / 10) * (n % 10);
        }
    }
}
