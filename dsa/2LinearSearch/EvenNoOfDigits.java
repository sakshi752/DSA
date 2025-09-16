public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] nums = {18,124,9,3452,98,435};
        System.out.println(EvenNoOfDigits(nums));
    }

    static int EvenNoOfDigits(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if(even(num)){
                count++;
            };
        }

        return count;
    }

    // function to check if the digit contains even number of digits or not
    static boolean even(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0 ? true : false;
    }

    static int digits(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;
    }
}
