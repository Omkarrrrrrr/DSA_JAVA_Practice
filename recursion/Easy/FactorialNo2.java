package Easy;

//Using iterative approach - for loop
import java.util.*;
public class FactorialNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int n = sc.nextInt();

        System.out.println("The factorial of number " + n + "is: " + factorialNum(n));
    }

    private static int factorialNum(int n) {

        int result =1;         //This ensures that the first multiplication works correctly since multiplying by 1 does not change the result.

        for(int i=1;i<=n;i++){
            result *= i;  // Multiply result by each number from 1 to n
        }
        
        return result;
    }
}
