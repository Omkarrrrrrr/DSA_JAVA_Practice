package Level1Que;

public class SumNto1 {
    public static void main(String[] args) {
        int n = 7;
        int result = sum(n);
        System.out.println("The sum of numbers till 7 is : " + result);
    }

    private static int sum(int n) {
        if(n <= 1){
            return 1 ;
        }
        else{
            return n + sum(n-1);
        }
    }
    
}
