public class MissingNoArray {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,2,7};
        int n = arr.length;

        // sum of natural numbers in an array
        int sum_natural_num = (n+1)*(n+2)/2;
        int sum= 0;

        // sum of current elements present in an array
        for(int i=0; i<n; i++)
        {
            sum += arr[i];
        }

        int missing_elem = 0;
        missing_elem = sum_natural_num - sum;
        System.out.println("Missing element in an array is : " +missing_elem);
    }
}
