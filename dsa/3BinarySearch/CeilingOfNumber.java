
public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 18, 19, 24, 33, 39, 42 };
        int ceilIndex = ceilingOfNumber(arr, -5);
        // int ceilIndex = ceilingOfNumber(arr, 0);
        // int ceilIndex = ceilingOfNumber(arr, 48);
        // int ceilIndex = ceilingOfNumber(arr, 34);
        if (ceilIndex >= 0) {
            System.out.println("ceiling of a number is " + arr[ceilIndex]);
        } else {
            System.out.println("target value is greater than array's elements");
        }
    }

    static int ceilingOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                System.out.println("arr " + arr[mid]);
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start < arr.length) {
            return start;
        } else {
            return -1;
        }
    }
}
