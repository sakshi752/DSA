public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 26, 37, 47, 55, 56, 72, 88 };
        System.out.println("index of 56 is " + search(arr, 72));
    }

    static int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }
}