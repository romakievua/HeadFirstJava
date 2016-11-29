import java.util.ArrayList;
import java.util.List;

/**
 * Created by pm-01 on 01.11.2016.
 */
public class AP {
    public int commonTwo(String[] a, String[] b) {
        int res = 0;
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i].compareTo(b[j]) < 0) {
                i++;
            } else if (a[i].compareTo(b[j]) > 0) {
                j++;
            } else if (a[i].compareTo(b[j]) == 0 && res > 0 && (a[i] == a[i-1] || b[j] == b[j-1])) {
                i++;
                j++;
            } else {
                res++;
                i++;
                j++;
            }
        }
        return res;
    }

    public int largestSpecialScore(int[] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 10 == 0 && arr[i] > res)
                res = arr[i];
        }
        return res;
    }

    public boolean isEndy(int n) {
        return ( ( n >= 0 && n <= 10 ) || ( n >= 90 && n <= 100 ) );
    }

    public int average(int[] scores, int start, int end) {
        int res = 0;
        for (int i = start; i <= end; i++) {
            res += scores[i];
        }
        res /= end-start+1;
        return res;
    }

    public void intArrToConsole(int[] myArray) {
        String div = "";
        for (int v : myArray) {
            System.out.print(div + v);
            div = ", ";
        }
        System.out.println();
    }

    public void strArrToConsole(String[] myArray) {
        String div = "";
        for (String v : myArray) {
            System.out.print(div + v);
            div = ", ";
        }
        System.out.println();
    }

    public static void main(String[] args) {
        AP ap = new AP();
        //int[] a = {5, 3, 6, 7, 2};
        //int[] b = {2, 20, 31};
        String[] a = {"a", "a", "b", "b", "c"};
        String[] b = {"b", "b"};
        System.out.println( ap.commonTwo(a, b) );
        //ap.strArrToConsole( ap.mergeTwo(a, b, 3) );
    }
}
