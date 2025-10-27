import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
       int[] arr={34,19,55,1,4,8};
       reverseArray(arr);
       System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr){
        int j = arr.length-1;
        for(int i =0;i<arr.length/2;i++){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]=temp;
            j--; 
        }
    }
}
