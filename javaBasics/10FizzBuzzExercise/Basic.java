import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Fizz Buzz");
        }else if (num % 3 == 0) {
            System.out.println("Fizz");
        }else if (num % 5 == 0) {
            System.out.println("Buzz");
        }else{
            System.out.println(num);
        }
    }
}
