public class PalindromeNumber {
    public static void main(String[] args) {
        int value = 121;
        int returnVal = isPalindrome(value)
        if (value == returnVal) {
            System.out.println("Number is a Palindrome Number");
        }else{
             System.out.println("Number is not a Palindrome Number");
        }
    }   
    public static int isPalindrome(int num){
        int revVal = 0;
        while (num!=0) {
            int ld = num%10;
            revVal = revVal*10+ld;
            num = num/10;
        }
        return revVal;
    } 
}
