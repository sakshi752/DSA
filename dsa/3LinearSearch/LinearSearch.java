public class LinearSearch {
    public static void main(String[] args) {
        int[] nums= {45,3,64,71,99,0,34};
        int target = 71;
        System.out.println(searchIndex(nums, target));
    }

    public static int searchIndex(int[] arr, int target) {

        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    
}