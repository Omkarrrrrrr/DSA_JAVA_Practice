package Level1Que;

public class PalindromeRev {
    static int sum = 0;

    static void rev(int n) {
        if (n == 0) {
            return;
        } else {
            int rem = n % 10;
            sum = sum * 10 + rem;
            rev(n / 10);
        }
    }

    static boolean pal(int n) {
        
        rev(n);  // Fill `sum` with the reversed number of `n`
        return n == sum; // Compare the original number with the reversed number
    }

    public static void main(String[] args) {
        System.out.println(pal(1232)); 
    }
}
