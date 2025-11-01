public class MaxWealth {
    public static void main(String[] args) {

        int[][] customers = {{1,2,3},{10,4,0},{8,9,14}};

        System.out.println("customer's max wealth amount is "+maxWealthyCustomer(customers));

    }

    static int maxWealthyCustomer(int[][] arr) {
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
            }
        }

        return max;
    }
}
