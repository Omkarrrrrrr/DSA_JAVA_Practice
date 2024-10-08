package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {1,3,4,5,8,9};
        System.out.println(Ls(arr,4,0));
        System.out.println(FindIndex(arr,4,0));                //Finds first occurence
        System.out.println(FindIndexLast(arr,4,arr.length-1));       //Finds last occurence

    }

    // we are finding if the target is in array or not
    static boolean Ls(int arr[] ,int target, int index ){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || Ls(arr , target , index+1);
    }   

    // Now we r finding at what index the target is found
    static int FindIndex(int arr[], int target , int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return FindIndex(arr, target, index+1);
        }
    }

    //Now we are finding index from the last
    static int FindIndexLast(int arr[], int target , int index){
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        else{
            return FindIndexLast(arr, target, index-1);
        }
    }
}
