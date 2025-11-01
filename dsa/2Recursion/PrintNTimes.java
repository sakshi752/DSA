
public class PrintNTimes {
    public static void main(String[] args) {
        // printMessage(5);
        printNNumbers(1, 5);
    }

    public static void printMessage(int n){
        if (n == 0) {
           return;
        }

        System.out.println("Hello Sakshi");
        System.out.println(n);
        printMessage(n-1);
    }

    public static void printNNumbers(int start, int end){
        if (start==end) {
            System.out.println(start);
            return;
        }
        System.out.println(start);
        printNNumbers(start+1, end);
    }
}
