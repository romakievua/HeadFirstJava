/**
 * Created by pm-01 on 26.09.2016.
 */
import java.util.*;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();
        a.add(0, "nol");
        a.add(1, "odin");
        a.add(2, "dva");
        a.add(3, "tri");
        printAL(a);
        a.remove(2);
        if (a.contains("dva")) {
            a.add("2.2");
        }
        if (a.contains("tri")) {
            a.add("chetyre");
        }
        printAL(a);
        if (a.indexOf("chetyre") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);
        printAL(a);
    }

    public static void printAL(ArrayList<String> al) {
        for (String element : al) {
            System.out.print(element + " ");
        }
        System.out.println(" ");
    }
}
