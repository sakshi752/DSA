import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value : ");
        int nthNum = sc.nextInt();
       System.out.println(nthNum + "th Fibonacci number is: " + fibo(nthNum));
    }
    static int fibo(int num){
        if (num<2) {
            return num;
        }

        return fibo(num-1) + fibo(num-2);
    }
}
