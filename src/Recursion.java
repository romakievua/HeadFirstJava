/**
 * Created by pm-01 on 03.11.2016.
 */
public class Recursion {
    public int strDist(String str, String sub) {
        if (str.length() < sub.length())
            return 0;
        else if (str.indexOf(sub) < 0)
            return 0;
        else if (str.indexOf(sub) >= 0 && str.indexOf(sub, str.indexOf(sub)+1) < 0)
            return sub.length();
        else if (str.substring(0,sub.length()).equals(sub))
            return  strDist(str.substring(1), sub)+sub.length();
        else
            return strDist(str.substring(1), sub)+1;
    }

    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        int[] a = {3};

        System.out.println( recursion.strDist("catcowcat", "cat") );
        System.out.println( recursion.strDist("catcowcat", "cow") );
        System.out.println( recursion.strDist("cccatcowcatxx", "cat") );

        System.out.println( "----------------" );

        System.out.println( recursion.strDist("catcowcat", "cat") == 9 );
        System.out.println( recursion.strDist("catcowcat", "cow") == 3 );
        System.out.println( recursion.strDist("cccatcowcatxx", "cat") == 9 );

        System.out.println( "----------------" );
/*
        System.out.println( recursion.strCopies("catcowcat", "cat", 2) == true );
        System.out.println( recursion.strCopies("catcowcat", "cow", 2) == false );
        System.out.println( recursion.strCopies("catcowcat", "cow", 1) == true );
        System.out.println( recursion.strCopies("iiijjj", "i", 3) == true );
        System.out.println( recursion.strCopies("iiijjj", "i", 4) == false );
        System.out.println( recursion.strCopies("iiijjj", "ii", 2) == true );
        System.out.println( recursion.strCopies("iiijjj", "ii", 3) == false );
        System.out.println( recursion.strCopies("iiijjj", "x", 3) == false );
        System.out.println( recursion.strCopies("iiijjj", "x", 0) == true );
        System.out.println( recursion.strCopies("iiiiij", "iii", 3) == true );
        System.out.println( recursion.strCopies("iiiiij", "iii", 4) == false );
        System.out.println( recursion.strCopies("ijiiiiij", "iiii", 2) == true );
        System.out.println( recursion.strCopies("ijiiiiij", "iiii", 3) == false );
        System.out.println( recursion.strCopies("dogcatdogcat", "dog", 2) == true );

        System.out.println( "----------------" );
        */
        /*
        System.out.println( recursion.count8(88788) == 6 );
        System.out.println( recursion.count8(23884) == 3);
        System.out.println( recursion.count8(1818188) == 5 );
        System.out.println( recursion.count8(188) == 3 );
        System.out.println( recursion.count8(1080) == 1 );
        */
    }

}
