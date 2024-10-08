package Easy;
import java.util.Scanner;

public class FibonacciFind{

    public static int FibonacciFind(int n){

        int result = 0;
        if(n == 1 || n == 0){
            return n;
        }
        else{
            result = FibonacciFind(n-1)+FibonacciFind(n-2);
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number in fibonacci series: ");
        int n = sc.nextInt();

        int result = FibonacciFind(n);
        System.out.println("the final output is : " + result);
    }
    
}

// Time complexity = O(2^n)
// Space complexity = O(n)