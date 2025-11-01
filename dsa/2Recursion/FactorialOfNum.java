public interface FactorialOfNum {
    public static void main(String[] args) {
        int num =-10;
        int res = fact(num);
       System.out.println(res != -1 ? "fact of number is " + res : "please apply proper val");
    }

    static int fact(int num){
        if (num ==1 || num == 0 ) {
            return 1;
        }else if (num<0) {
            return -1;
        }

        return num * fact(num-1);
    }
}
