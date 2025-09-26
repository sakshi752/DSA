public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] arr ={1,2,4,5,3,2,1,0};
        System.out.println("peak element in mountain arr is "+search(arr));
    }

    static int search(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }else{
              end = mid;  
            }
        }
        return arr[start];
    }
}
