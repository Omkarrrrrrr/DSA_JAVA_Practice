package Easy;
public class NumbersEx2 {
    public static void main(String[] args) {
      // Print numbers from 1 to 5 using recursion
        print(1);  
     
}

    static void print(int n) {
        if (n > 5) { // Base case: stop recursion when n is greater than 5
            return;
        }
        System.out.println(n); // Print the current number
        print(n + 1); // Recursive call to print the next number
       
    }
    
}
