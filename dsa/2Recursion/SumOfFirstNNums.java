public class SumOfFirstNNums {
    public static void main(String[] args) {
        System.out.println(calSum(6));
    }
    static int calSum(int num){
        if (num == 1) {
            return 1;
        }

        return num + calSum(num-1);
    }
}
