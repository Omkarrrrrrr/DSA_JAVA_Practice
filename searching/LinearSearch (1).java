// Tc = O(n);
// Sc = O(1);
import java.util.Scanner;

class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of elements present in an array");
        int n = sc.nextInt();

        System.out.println("Enter the array elements");
        int [] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target element");
        int x = sc.nextInt();

        //Implementation of linear search
        int idx = -1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==x){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            System.out.println("Searched element is not found in array");
        }
        else{
            System.out.println("Searched element is found at loaction : "+idx);
        }
    }
}