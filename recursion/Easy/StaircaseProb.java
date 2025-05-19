package Easy;
import java.util.Scanner;

public class StaircaseProb {
    public static int countNum(int n) {
        
        if (n <= 1) {
            return 1;
        } 
        return countNum(n - 1) + countNum(n - 2);
        
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of stairs: ");
        int n = sc.nextInt();

        countNum(5);
        System.out.println("Total no of ways to climb the stairs: " + countNum(n));
    }
}









//Time complexity = O(2^n)
//Space comoplexity = O(n)