public class OrderAgnostic {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 26, 37, 47, 55, 56, 72, 88 };
        boolean isAscending = arr[0] < arr[arr.length - 1];
        System.out.println("index of 56 is " + agnosticSearch(arr, 72,isAscending));
    }

    static int agnosticSearch(int[] arr, int target, boolean isAscending) {
        int start = 0, end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            if (isAscending) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

        }

        return -1;
    }
}
