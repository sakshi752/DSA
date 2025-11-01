import java.util.Scanner;

public class PrintFiboSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int val = sc.nextInt();
        int[] fiboSeries = new int[val+1];

        for(int i = 0 ; i<fiboSeries.length ;i++){
            fiboSeries[i] = fibo(i);
        }

        System.out.print("Fibonacci Series: ");
        for (int num : fiboSeries) { 
            System.out.print(num + " ");
        }
    }

    static int fibo(int num){
        if (num<2) {
            return num;
        }

        return fibo(num-1) + fibo(num-2);
    }
}
