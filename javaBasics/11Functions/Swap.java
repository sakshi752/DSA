public class Swap {
    public static void main(String[] args) {
        swap(19, 72);
        // note primitive data is not swapped because they are passed by value but but in array there is call by reference
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
