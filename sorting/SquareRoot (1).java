// TC = O(log n)
// SC = O(1)
import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class SquareRoot {

    public static int findSquareRoot(int num){
        int low=0,high =num ,result = -1;

        //Modified binary search
        while(low <= high){
            int mid = low +(high-low)/2;
            long val = mid * mid;

            if(val == num){
                //Perfect square root
                return mid;    
            }
            else if(val<num){
                //Store the floor value, incase the no is not perfect sqauare root, we can print the floor value
                result= mid;
                low = mid +1;

            }
            else{
                high = mid -1;

            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter the no of which you want square root: ");
        int num = sc.nextInt();

        //FunctionCalling
        int result = findSquareRoot(num);
        System.out.println("Square root of the given number is: "+result);
    }
}
