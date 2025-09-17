public class FirstAndLastPosition {
    public static void main(String[] args) {

        int[] arr = { 3, 4, 6, 7, 7, 7, 7, 7, 7, 7, 9, 9, 10 };
        // int[] res = bruteForce(arr, 1);
        // int[] res = bruteForce(arr, 6);

        int[] res = optimized(arr, 7);

        if (res[0] != -1) {
            System.out.println("first position of target element is " + res[0] + " and it's last pos is " + res[1]);
        } else {
            System.out.println("Target element is not present in the array");
        }

    }

    static int[] bruteForce(int[] nums, int target) {

        int first = -1, last = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                if (first == -1) {
                    first = i;
                }

                last = i;
            }
        }

        return new int[] { first, last };
    }

    static int[] optimized(int[] nums, int target) {
        int startIndex = search(nums, target, true);
        int endIndex = search(nums, target, false);
        System.out.println("start " + startIndex);
        System.out.println("end " + endIndex);
        return new int[] { startIndex, endIndex };
    }

    static int search(int[] nums, int target, boolean isStartIndex) {
        int ans = -1;
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                ans = mid; // potential answer
                if (isStartIndex) {
                    end = mid - 1; // look left for earlier index
                } else {
                    start = mid + 1; // look right for later index
                }
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }
}
