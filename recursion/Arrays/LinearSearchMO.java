package Arrays;
import java.util.ArrayList;           // compulsory statement
public class LinearSearchMO {
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,5,6,7};
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
    
}
