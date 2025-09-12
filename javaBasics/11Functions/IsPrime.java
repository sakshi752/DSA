public class IsPrime {
    public static void main(String[] args) {
        int n = 29; // test number

        if (isPrime(n)) {
            System.out.println(n + " is a Prime number");
        } else {
            System.out.println(n + " is NOT a Prime number");
        }
    }   
    static boolean isPrime(int num){
        if (num<=1) return false;
        if(num ==2 || num ==3) return true;

        if (num%2 == 0) {
            return false;
        }
        
        for (int i =3;i*i<=num;i+=2){
            if (num%i ==0) {
                return false;
            }
        }
        return true;
    } 
}
