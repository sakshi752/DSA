import java.util.ArrayList;
import java.util.Arrays;

public class Divisors {
    public static void main(String[] args) {
        int num = 36;
        int[] res = divisors(num);
        System.out.println("divisors are "+ Arrays.toString(res));
    }
    public static int[] divisors(int num){
        ArrayList<Integer> divisors = new ArrayList<>();
        // for(int i = 1;i<=num ;i++){
        //     if (num%i == 0) {
        //         divisors.add(i);
        //     }
        // }
        
        // optimal
        for(int i = 1;i*i<=num ;i++){
            if (num%i == 0) {
                divisors.add(i);
            }
        }
        int[] result = new int[divisors.size()];

        for (int i = 0; i < divisors.size(); i++) {
            result[i] = divisors.get(i);
        }

        return result;
    }
}
