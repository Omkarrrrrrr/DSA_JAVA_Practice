public class DuplicateElemArray {
    public static void main(String[] args) {
        int[] arr = {2,5,5,4,3,1,1};
        int n  = arr.length;

        for(int i=0; i<n ; i++){
            for(int j=i+1; j<n;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Duplicate elements found are: "+arr[i]);
                }
            }
        }
    }
}


// time complexity = O(n²) - nested loops are used
// space complexity = O(1)