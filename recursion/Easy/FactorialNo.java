package Easy;
import java.util.Scanner;

public class FactorialNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        //FunctionCalling
        int result = factorialNum(n);
        System.out.println(result);
        ;

    }

    private static int factorialNum(int n) {
        if (n == 0 || n == 1) {
            return 1;                                       //base case condition
        } else {
            int result = n * (factorialNum(n - 1));         //Recursive function calling
            return result;
        }

    }
}

//Time complexity = O(n)
//Space complexity = O(n)