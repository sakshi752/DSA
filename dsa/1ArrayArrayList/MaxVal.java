public class MaxVal {
    public static void main(String[] args) {
        int[] arr = {34,19,55,1,4,8};

        System.out.println("max val is "+maxVal(arr));

    }
    static int maxVal(int[] arr){
        int maxVal =arr[0];
        for(int i =1;i<arr.length;i++){
            if (arr[i]>maxVal) {
                maxVal =arr[i];
            }
        }
        return maxVal;
        
    }
}
