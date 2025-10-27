public class Armstrong {
    public static void main(String[] args) {
        int num = 15;
        int val = isArmStrong(num);
        if (val == num) {
            System.out.println("num is armstrong number");
        }else{
             System.out.println("num is not armstrong number");
        }
    }
    public static int isArmStrong(int num){
        int length = String.valueOf(num).length(),sum=0;
        while (num!=0) {
            int ld = num%10;
            sum +=   Math.pow(ld, length);
            num = num/10;
        }
    return sum;
    
    }
}
