import java.util.Date;

public class Basic {
    public static void main(String[] args) {
        // primitive types
        byte b = 100; // takes 1 by
        short s = 30000;
        int i = 100000;
        long l = 10000000000L;
        float f = 3.14f;
        double d = 3.14159265359;
        char c = 'A';
        boolean flag = true;

        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        // basic of variables
        int val = 100,val1 =150;
        int val2 = val;
        val=40;


        // Swap two numbers without using a third variable.
        int num1 = 20;
        int num2 = 30;


        System.out.println("Before swap num1= "+num1 + "num2 " + num2);

        num1 = num1+ num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swap num1= "+num1 + "num2 " + num2);

        // reference types
        // 1. Date
        Date now = new Date();
        System.out.println("current time "+now);

        // 2. string
        String msg = new String("hello people");
        String str = "hey"; //short way to use string

        // concat
        System.out.println(msg + " "+str);
        
    }

}