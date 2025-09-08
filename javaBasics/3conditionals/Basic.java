import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // 1. Take a number and print if it’s positive, negative, or zero.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("num is positive");
        } else if (num < 0) {
            System.out.println("num is negative");
        } else {
            System.out.println("num is 0");
        }

        // Find the largest of three numbers using if-else.

        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();

        System.out.print("Enter number 3: ");
        int num3 = sc.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("num1 is largest: " + num1);
            } else {
                System.out.println("num3 is largest: " + num3);
            }
        } else {
            if (num2 > num3) {
                System.out.println("num2 is largest: " + num2);
            } else {
                System.out.println("num3 is largest: " + num3);
            }
        }

        int temp = 32;
        if (temp > 30) {
            System.out.println("it's a hot day");
            System.out.println("please drink water");
        } else if (temp > 20) {
            System.out.println("It's a beautiful day");
        } else {
            System.out.println("cold day");
        }
    }
}
