/**
 * Created by pm-01 on 05.10.2016.
 */
public class String3 {
    public String notReplace(String str) {
        String result = "";
        char[] strCh = str.toCharArray();
        char prev = '.';
        char next = '.';
        for (int i = 0; i < strCh.length; i++) {
            if (i > 0)
                prev = strCh[i-1];
            else
                prev = '.';
            if (i < strCh.length - 2)
                next = strCh[i+2];
            else
                next = '.';
            if (strCh[i] == 'i' && strCh[i+1] == 's' && !Character.isLetter(prev) && !Character.isLetter(next)) {
                result += "is not";
                i++;
            } else {
                result += strCh[i];
            }
        }

        return result;
    }

    public int countStr(String str, String subStr) {
        int start = 0;
        int count = 0;
        while (true) {
            int found = str.indexOf(subStr, start);
            if (found != -1)
                count++;
            if (found == -1) return count;
            start = found + subStr.length(); // move start up for next iteration
        }
    }

    public static void main(String[] args) {
        String3 string3 = new String3();

        System.out.println( string3.notReplace("is test") );
        System.out.println( string3.notReplace("is-is") );
        System.out.println( string3.notReplace("This is right") );
/*
        System.out.println( string3.maxBlock("hoopla") == 2);
        System.out.println( string3.maxBlock("abbCCCddBBBxx") == 3);
        System.out.println( string3.maxBlock("") == 0);
        System.out.println( string3.maxBlock("xyz") == 1);
        System.out.println( string3.maxBlock("xxyz") == 2);
        System.out.println( string3.maxBlock("xyzz") == 2);
        System.out.println( string3.maxBlock("abbbcbbbxbbbx") == 3);
        System.out.println( string3.maxBlock("XXBBBbbxx") == 3);
        System.out.println( string3.maxBlock("XXBBBBbbxx") == 4);
        System.out.println( string3.maxBlock("XXBBBbbxxXXXX") == 4);
        System.out.println( string3.maxBlock("XX2222BBBbbXX2222") == 4);
*/
    }
}
