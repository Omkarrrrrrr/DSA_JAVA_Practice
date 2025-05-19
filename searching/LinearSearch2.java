public class LinearSearch2{
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9};
        int target = 5;
        int ans = linearSearch(arr, target);
        int ans2 = linearSearch2(arr, target);
        System.out.println(ans);
        System.out.println(ans2);

    }

    static int linearSearch(int[]arr,int target){
        if(arr.length == 0){
            return -1;
        }
        
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;

    }

      static int linearSearch2(int[]arr,int target){
        if(arr.length == 0){
            return -1;
        }
        
        for(int index = 0; index < arr.length; index++){
            int element = arr[index];
            if(element == target){
                return target;
            }
        }
        return -1;

    }
}