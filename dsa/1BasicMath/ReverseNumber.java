import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("Reversed number of "+number + " is "+revNumber(number)); 
    }   
    public static int revNumber(int num){
        int revVal =0;
        if (num<10 && num>=0) {
            return 1;
        }
        while (num!=0) {
            int lastDigit = num%10;
            revVal = revVal *10 +lastDigit;
            num = num/10;
        }
        return revVal;
    } 
}
