import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        // 1. Print numbers from 1 to 100 using a loop
        // for (int i = 1; i <= 100; i++) {
        // System.out.println(i);
        // }

        // 2. Print the multiplication table of a number.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num ");
        int num = sc.nextInt();

        System.out.println("Multiplication table of num : " + num);
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        // 3. Calculate the sum of digits of a number.
        // int sum = 0;
        // while (num > 0) {
        //     int val = num % 10;
        //     sum += val;
        //     num /= 10;
        // }

        // System.out.println("sum of digits = " + sum);

        // Print the factorial of a number.
        int factorial = 1;
        System.out.println("num "+num);
        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("factorial = " + factorial);
    }
}
