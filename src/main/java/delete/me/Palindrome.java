package delete.me;


public class Palindrome {

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(legacy_palindrome(str));
        System.out.println(modern_palindrome(str));
    }

    private static boolean legacy_palindrome(String str){

        for(int i=0,j=str.length()-1;i<str.length();i++,j--){
            if(!(str.charAt(i) == str.charAt(j))){
                return false;
            }
        }
        return true;
    }

    private static boolean modern_palindrome(String str){
        StringBuffer sb = new StringBuffer(str);
        return str.equals(sb.reverse().toString())?true:false;

    }
}
