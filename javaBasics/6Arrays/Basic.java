import java.util.Arrays;

public class Basic {
    public static void main(String[] args) {
        // ways to use array
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 34;
        numbers[2] = 3;
        numbers[3] = 34;
        numbers[4] = 8;
        // numbers[10] = 100;   this will give exception(error)

        int[] nums = {4,23,5,1,0,3};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));


        // 2d arr
        int[][] arr = new int[2][3];
        arr[0][0]=1;
        System.out.println(Arrays.deepToString(arr));

        int[][] arr1 = {{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr1));
    }    
}
