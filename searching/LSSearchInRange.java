

public class LSSearchInRange {
    public static void main(String[] args) {
        
        int arr1[] = {15,45,65,34,23,87,56};
        int target = 34;

System.out.println(searchRange(arr1, target, 1, 4));

        
        

    }

    static int searchRange(int arr1[],int target, int start , int end){
        if(arr1.length == 0){
           System.out.println("Array is not valid");
           return -1;
        }

        for(int index = start; index <= end; index++){
            
            int element = arr1[index];
            if(element == target){
                return index;
            
            }
        }
        return -1;
    
}
}
