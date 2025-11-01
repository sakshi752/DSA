import java.util.Arrays;

public class ArrayPassingInFunc {
    public static void main(String[] args) {
        int[] nums = {1,35,124};
        System.out.println("nums before change "+Arrays.toString((nums)));
        change(nums);
        System.out.println("nums after change "+Arrays.toString((nums)));
    }

    static void change(int[] arr){
        arr[3] = 20;
    }
}
