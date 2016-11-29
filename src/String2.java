/**
 * Created by pm-01 on 03.10.2016.
 */
public class String2 {
    public String wordEnds(String str, String word) {
        String result = "";
        int start = 0;
        while (true) {
            int found = str.indexOf(word, start);
            //System.out.println("found = " + found);
            if (found > 0) {
                result += str.substring(found - 1, found);
                //System.out.println("result += " + str.substring(found - 1, found));
            }
            if (found != -1 && found + word.length() < str.length()) {
                result += str.substring(found + word.length(), found + word.length() + 1);
                //System.out.println("result += " + str.substring(found + word.length(), found + word.length() + 1));
            }
            if (found == -1)
                break;
            start = found + word.length();
            }
        return result;
    }


    public static void main(String[] args) {
        String2 string2 = new String2();

        System.out.println( string2.wordEnds("abcXY123XYijk", "XY") );
        System.out.println( string2.wordEnds("XY123XY", "XY") );
        System.out.println( string2.wordEnds("XY1XY", "XY") );
/*
        System.out.println( string2.sameStarChar("xy*yzz") == true );
        System.out.println( string2.sameStarChar("xy*zzz") == false );
        System.out.println( string2.sameStarChar("*xa*az") == true );
        System.out.println( string2.sameStarChar("*xa*bz") == false );
        System.out.println( string2.sameStarChar("*xa*a*") == true );
        System.out.println( string2.sameStarChar("") == true );
        System.out.println( string2.sameStarChar("*xa*a*a") == true );
        System.out.println( string2.sameStarChar("*xa*a*b") == false );
        System.out.println( string2.sameStarChar("*12*2*2") == true );
        System.out.println( string2.sameStarChar("12*2*3*") == false );
        System.out.println( string2.sameStarChar("abcDEF") == true );
        System.out.println( string2.sameStarChar("XY*YYYY*Z*") == false );
        System.out.println( string2.sameStarChar("XY*YYYY*Y*") == true );
        System.out.println( string2.sameStarChar("12*2*3*") == false );
        System.out.println( string2.sameStarChar("*") == true );
        System.out.println( string2.sameStarChar("**") == true );
*/
    }
}
