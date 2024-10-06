package Level1Que;

import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number here: ");
        int n = sc.nextInt();

        int sum = sum(n);
        System.out.println("The sum of digits is : " + sum);
    }

    private static int sum(int n) {
        if(n == 0){
            return 0;
        }
        else{
            return  sum(n/10) + n % 10; 
        }
    }
    
}

// time complexity = O(log n)
// Space complexity = O(log n)