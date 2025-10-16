public class SearchInMountainArr {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 5, 6, 7, 8, 6, 5, 4, 2 };
        int target = 6;
        int peakIndex = searchPeakIndex(arr);
        if (arr[peakIndex] == target) {
            System.out.println("target is at index " + peakIndex);
        }
        int leftSearch = agnosticSearch(arr, target, true, 0, peakIndex - 1);
        if (leftSearch != -1) {
            System.out.println("Target is at index " + leftSearch);
            return;
        }

        int rightSearch = agnosticSearch(arr, target, false, peakIndex + 1, arr.length - 1);
        if (rightSearch != -1) {
            System.out.println("Target is at index " + rightSearch);
            return;
        }

        System.out.println("Target not found in the mountain array.");
    }

    static int searchPeakIndex(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }

    static int agnosticSearch(int[] arr, int target, boolean isAscending, int start, int end) {

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
