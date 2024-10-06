package Level1Que;

public class Factorial {
    public static void main(String[] args) {
        int n = 7;
        int result = fact(n);
        System.out.println("the factorial of number n is : " + fact(n));
    }

    private static int fact(int n) {
       
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * (fact(n - 1));
        }
        
    }

}
