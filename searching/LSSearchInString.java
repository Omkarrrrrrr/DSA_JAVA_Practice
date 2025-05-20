

public class LSSearchInString {
    public static void main(String[] args) {
        String str1 = "Java Programming";
        char target = 'm';
        boolean ans = SearchChar(str1, target);
       // System.out.println(ans);
        int ans2 = SearchChar3(str1, target);
        System.out.println(ans2);
       //System.out.println(Arrays.toString(str1.toCharArray()));

    }

    static boolean SearchChar(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(int i=0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

       static int SearchChar3(String str, char target){
        if(str.length() == 0){
            return -1;
        }

        for(int i=0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return i;
            }
        }
        return -1;
    }
    

    //using for each loop
    static boolean SearchChar2(String str, char target){
        if(str.length() == 0){
            return false;
        }

        for(char ch: str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
    
}
