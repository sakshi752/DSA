public class VariableArguments {
    public static void main(String[] args) {
        int res = sum(1,2,3);
        System.out.println("sum of numbers is "+res);
        multiply(10, 58, "sakshi","sheel");
    }   
    static void multiply(int a,int b,String ...v){
        // here a and b is needed and you can send any number of strings

    }
    static int sum(int ...nums){
        // here nums is internally an array of integers
        System.out.println("nums "+nums[0]);
        int sum = 0;
        for(int i =0;i<nums.length;i++){
            sum+=nums[i];
        }
        return sum;
    } 
}
