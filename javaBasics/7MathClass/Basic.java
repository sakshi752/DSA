
public class Basic {
    public static void main(String[] args) {
        int roundNum = Math.round(1.1F);
        int ceilNum = (int) Math.ceil(2.1F);
        int floorNum = (int) Math.ceil(2.9F);
        int maxNum = Math.max(1, 2);
        int minNum = Math.min(2, 3);

        System.out.println("round num " + roundNum);
        System.out.println("ceil number " + ceilNum);
        System.out.println("floor number " + floorNum);
        System.out.println("min number " + minNum);
        System.out.println("max number " + minNum);

        double randomNum = Math.random();
        double randomNum1 = Math.round(Math.random() * 100);
        System.out.println("random number " + randomNum1);
    }
}
