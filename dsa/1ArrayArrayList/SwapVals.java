public class SwapVals {
    public static void main(String[] args) {
        int[] arr = {1,24,6,9};
        swap(arr, 0, 3);
        
    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
