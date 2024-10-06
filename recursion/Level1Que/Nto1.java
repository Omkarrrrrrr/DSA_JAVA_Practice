package Level1Que;

public class Nto1 {

    static void fun(int n) {     // printing 5 to 1
        if (n == 0) {
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    static void funRev(int n){ // Printing 1 to 5 by using rev fun
        if(n == 0){
            return ;
        }
        funRev(n-1);
        System.out.println(n);
    }

    static void funBoth(int n){
        if(n == 0){
            return ;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        // fun(5);
        // funRev(5);
        funBoth(5);
    }

}
