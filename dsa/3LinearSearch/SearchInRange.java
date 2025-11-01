public class SearchInRange {
    public static void main(String[] args) {
        int[] nums = {9,20,35,73,46,2,99};
    }
    static boolean search(int[] arr,int target,int start,int end){

        if (arr.length == 0) {
            return false;
        }

        for(int i =start;i<=end;i++ ){
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }
}
