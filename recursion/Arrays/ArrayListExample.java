package Arrays;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        int arr[] = {3,4,5,4,6,4,8};
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> ans = findAllIndex(arr, 4, 0, list);
        System.out.println(ans);
        
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1, list);
    }

}
