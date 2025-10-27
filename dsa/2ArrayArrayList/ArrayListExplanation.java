import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExplanation {
    public static void main(String[] args) {
        // array list is basically slower than original arr
        ArrayList<Integer> list = new ArrayList<>();

        // how to add
        list.add(46);
        list.add(33);
        list.add(487);
        list.add(1);
        list.add(877);
        list.add(54);

        System.out.println("before change" + list);
        System.out.println(list.contains(91));

        // update
        list.set(0, 89);

        System.out.println("after change" + list);

        // remove
        list.remove(4);

        System.out.println("after removal " + list);

        // get item
        System.out.println("get item from list "+list.get(1));

        // input
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
           newList.add(sc.nextInt());
        }

        System.out.println("new list "+newList);
    }
}
