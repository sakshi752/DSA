public class IsPrime {
    public static void main(String[] args) {
        // int num = 12;
        int num = 3;
         System.out.println(isPrime(num) ? "Number is prime" : "Number is not prime");
    }

    public static boolean isPrime(int num) {
        if (num<2) {
            return false;
        }
        for (int i = 2; i * i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
