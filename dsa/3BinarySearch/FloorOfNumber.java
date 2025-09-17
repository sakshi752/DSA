public class FloorOfNumber {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 18, 19, 24, 33, 39, 42 };
        // int floorIndex = floorOfNumber(arr, 0);
    //   int floorIndex = floorOfNumber(arr, 23);
     int floorIndex = floorOfNumber(arr, 50);
        if (floorIndex >= 0) {
            System.out.println("floor of a number " + arr[floorIndex]);
        } else {
            System.out.println("no value is smaller than target element");
        }

    }

    static int floorOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        if (target > arr[end]) {
            return arr.length - 1;
        }

        if (target < arr[start]) {
            return -1;
        }

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

        if (end >= 0) {
            return end;
        } else {
            return -1;
        }
    }
}
