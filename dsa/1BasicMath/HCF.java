public class HCF {
    public static void main(String[] args) {
        int n1 = 12, n2 = 18;
        System.out.println("HCF is: " + Euclidien(n1, n2));
    }
    

    public static int bruteForce(int n1, int n2) {
        int gcd = 1;

     
        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static int Euclidien(int a,int b){
        while (a>0 && b>0) {
            if (a>b) {
                a = a%b;
            }else{
                b = b%a;
            }
        }

        if (a==0) return b;
        else return a;
    }
}

