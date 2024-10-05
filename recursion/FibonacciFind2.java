// here we will be finding using for loop
//By taking user inout

import java.util.*;

public class FibonacciFind2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number here: ");
        int n = sc.nextInt();

        if(n<=0){
            System.out.println("No must be greater than zero");
            return ;       //program terminates if the input is invalid.
        }

        int a = 0,b =1;
        
        for(int i=0;i<=n;i++){
            if(i == 0){
                System.out.print("fibonacci series is : " + a);
            }
            else{
                System.out.print(","+ b);
                int next = a + b;
                a = b;
                b = next;
            }
        }
        
    }
    
}
