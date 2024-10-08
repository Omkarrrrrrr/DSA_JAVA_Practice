package Arrays;

public class RBS {
    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8, 9, 1, 2, 3 };
        System.out.println(search(arr, 2, 0, arr.length - 1));
    }

    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1; // Base condition
        }
    
        int m = s + (e - s) / 2;
        if (arr[m] == target) { // Checking if target is at middle
            return m;
        }
    
        // Left side sorted check
        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1); // Search left half
            }
            return search(arr, target, m + 1, e); // Search right half
        }
    
        // Right side sorted check
        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e); // Search right half
        }
        return search(arr, target, s, m - 1); // Search left half
    }
}
