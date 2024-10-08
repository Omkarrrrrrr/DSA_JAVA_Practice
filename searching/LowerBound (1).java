//TC = O(log n)
// SC = O(1)
import java.util.*;
public class LowerBound {


    //Function defining
    public static int findFirstOccurence(int[] arr, int target){
        int low = 0,high = arr.length -1;
        int result = -1;

        while(low<= high){
            // to avoid overflow
            int mid = low + (high-low)/2;
            if(arr[mid]== target){
                result = mid;
                //Traverse to the left side of array
                high = mid -1;
            }
            else if(arr[mid]> target){
                high = mid -1;
            }
            else{
                low = mid+1;

            }
        }
        return result;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of elements in an array :");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();

        }

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        //Function calling 
        int result = findFirstOccurence(arr,target);
        if(result == -1){
            System.out.println("Target element is not present in an array");
        }
        else{
            System.out.println("Target elements first occurece is present at index "+ result);
        }
    }
    
}
