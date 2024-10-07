package Level1Que;

public class Reverse {
    static int sum = 0;
    static int rev(int n){
        if(n == 0){
            return 0;
        }
        else{
            int rem = n % 10;
            sum = sum * 10 + rem;
            return rev(n/10);
        }
        
    }
    public static void main(String[] args) {
        rev(3456);
        System.out.println(sum);
    }
    
}
