import java.text.NumberFormat;

public class Basic {
    public static void main(String[] args) {
        NumberFormat curr = NumberFormat.getPercentInstance();
        String res = curr.format(.201);
        System.out.println("res "+res);
    }    
}
