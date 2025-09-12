import java.util.Arrays;
import java.util.Scanner;

public class TwoDimensionalarray {
    public static void main(String[] args) {
        // they are kind of array of arrays
        int[][] arr = { { 1, 2, 4 }, { 2, 4, 5 } };
        int[][] nums = { { 1, 2, 4 }, // 0th index
                { 9, 5 }, // 1th index
                { 8, 7, 6, 10 } // 2nd index -> nums[2] = {8, 7, 6, 10}
        };

        // input
        Scanner sc = new Scanner(System.in);
        int[][] vals = new int[3][2];

        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals[i].length; j++) {
                vals[i][j] =sc.nextInt();
            }
        }
        
        for (int i = 0; i < vals.length; i++) {
            for (int j = 0; j < vals[i].length; j++) {
                System.out.print(vals[i][j] + " ");
            }
            System.out.println();
        }

    }
}
