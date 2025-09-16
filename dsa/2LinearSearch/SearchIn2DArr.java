public class SearchIn2DArr {
    public static void main(String[] args) {
        int[][] nums = {{43,71,89},{97,22,4},{1,32,68}};

        int[] res = searchIn2D(nums,68 );

        if (res[0] == -1) {
            System.out.println("Element not found.");
        } else {
            System.out.println("Element found at row " + res[0] + ", column " + res[1]);
        }

    }

    static int[] searchIn2D(int[][] arr,int target){
        for(int i = 0;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
               if (target == arr[i][j]) {
                 return new int[]{i, j};
               } 
            }
        }
         return new int[]{-1, -1};
    }
}
