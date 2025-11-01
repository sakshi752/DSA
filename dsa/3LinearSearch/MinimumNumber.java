public class MinimumNumber {
    public static void main(String[] args) {
        int[] nums = { 9, 20, 35, 73, 46, 2, 99 };
        System.out.println("minimum number is "+ minimum(nums));
    }

    public static int minimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }
}
