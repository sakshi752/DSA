import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int number = sc.nextInt();
        System.out.println("digits in number "+number + " is "+countDigitsInNumber(number)); 
    }

    public static int countDigitsInNumber(int num) {
        int ct = 0;
        if (num<10 && num>=0) {
            return 1;
        }
        while (num != 0) {
            ct++;
            num = num / 10;
        }
        return ct;
    }
}
