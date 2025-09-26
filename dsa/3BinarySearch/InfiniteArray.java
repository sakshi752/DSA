public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,7,8,9,10,11,12,15,23,30,35};

        System.out.println("and is "+findingRage(arr, 11));
    }

    static int findingRage(int[] arr,int target){
        // first find the range and initially start with a box of size 2
        int start =0;
        int end =1;  

        while (target>arr[end]) {
            int newStart = end+1;
            // double the box value that means end = previous end + sizeofbox * 2
            end = end + (end-start+1)*2;
            start = newStart;
        }
        

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
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
