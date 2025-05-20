public class LSMinNumber {
    public static void main(String[] args) {
        
        int arr [] = {99,88,45,3,54,23,22};

        System.out.println(minNumber(arr));

    }

    static int minNumber(int arr []){
        
       // int ans = arr[0];            //will assume first element as minimum
        int ans = arr[0];
        for(int i=0; i < arr.length; i++){
            if(arr[i] < ans){
                ans = arr[i];
            }
        }
        return ans;

    }
    
}
