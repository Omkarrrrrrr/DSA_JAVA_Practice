import java.util.Scanner;

public class StaircaseProb {
    public static int countNum(int n) {
        int result = 0;
        if (n <= 1) {
            return n;
        } else {
            result = countNum(n - 1) + countNum(n - 2);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs: ");
        int n = sc.nextInt();

        // Function calling
        // Relationship between count of stairs and recursion problem
        // Call countNum(n + 1) to compute the total number of ways to reach the top of the staircase.
        // We add 1 to 'n' because we want to include the final step to the top (reaching the (n+1)-th step).
        int result = countNum(n + 1);
        System.out.println("Total no of ways to climb the stairs: " + result);
    }
}
//Time complexity = O(2^n)
//Space comoplexity = O(n)