package Arrays;
import java.util.ArrayList;           // compulsory statement
public class LinearSearchMO {
    public static void main(String[] args) {
        int arr[] = {1,2,4,4,5,6,7};
        // findAllIndex(arr, 4, 0);
        // System.out.println(list);

        System.out.println(findAllIndex2(arr, 4, 0));
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
    
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {

        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) {
            return list;                         //This will return an empty array list
        }

        // this will contain answer for that function call only
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
