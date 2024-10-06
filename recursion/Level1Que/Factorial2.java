package Level1Que;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a no here to find its factorial: ");
        int n = sc.nextInt();

        fact(n);
        System.out.println(fact(n));
    }

    private static int fact(int n) {
        if ( n == 0 || n == 1){
            return 1;
        }
        else{
            return n * fact(n-1);
        }
    }
}
