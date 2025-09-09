import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
            sum();
            greetings("heyy sakshiii");
            System.out.println("return greeting "+ returnGreetings());
            int multiplicationAns =  mul();
            System.out.println("multiplication ans "+multiplicationAns);

            int subRes = sub(40, 72);
            System.out.println("substraction result is "+subRes); 
        }

    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = " + sum);
    }

    static void greetings(String msg) {
        System.out.println("The message is " + msg);
    }

    static String returnGreetings() {
        return "hey";
    }
      
    static int mul(){
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = sc.nextInt();
        int mul = num1 * num2;
        return mul;
    }

    static int sub(int a,int b){
        return a>b? a-b: b-a;
    }
}
