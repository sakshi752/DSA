public class IsStrPalindrome {
    public static void main(String[] args) {
        String str = "sakas";
        boolean bool = isPalindrome(0, str);
        System.out.println(bool? "string is palindrome":"string is not palindrome");
    }

    static boolean isPalindrome(int i , String str){
        if (i>=str.length()/2) return true;
        else if (str.charAt(i) != str.charAt(str.length()-i-1)) {
            return false;
        }
        else{
            return isPalindrome(i+1, str);
        }
    }
}
