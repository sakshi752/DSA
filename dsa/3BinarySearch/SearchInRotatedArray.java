public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr = {13,14,15,17,18,20,1,3,4,5,6,7,8,9,10,11,12};
        int pivotIndex = findPivot(arr);
        System.out.println("pivot "+pivotIndex);
    }

    static int findPivot(int[] arr) {
        int start = 0, end = arr.length - 1;
        if (arr[start] < arr[end]) {
            return end;
        }else{
            while (start<end) {
                int mid = start + (end - start) / 2;

                if (arr[mid]>arr[mid+1]) {
                    return mid;
                }else if (arr[mid]<arr[mid-1]) {
                    return mid-1;
                }else{
                    end= mid-1;
                }
            }
        }
      
    }
}
