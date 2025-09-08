import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // 1. print hello
        System.out.println("Hello");

        // 2. Take two numbers as input and print their sum, difference, product, and
        // quotient.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("sum : " + (num1 + num2));
        System.out.println("sum : " + (num1 - num2));
        System.out.println("sum : " + (num1 * num2));
        System.out.println("sum : " + (num1 / num2));
        System.out.println("sum : " + (num1 % num2));

        // 3. Take a string input
        System.out.print("Enter your name: ");
        String name = sc.nextLine().trim();
        System.out.println("hello "+name);

    }
}