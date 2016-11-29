/**
 * Created by pm-01 on 22.09.2016.
 */
public class String1 {
    public String deFront(String str) {
        String result = "";
        if (str.indexOf('a') == 0)
            result = result + 'a';
        System.out.println(result);
        if (str.indexOf('b',1) == 1)
            result = result + 'b';
        System.out.println(result);
        if (str.length() >= 2)
            result += str.substring(2);
        return result;
    }


    public static void main(String[] args) {
        String1 str1 = new String1();
        //System.out.println(str1.deFront("Hello") );
        //System.out.println(str1.deFront("java") );
        System.out.println(str1.deFront("bbb") );
    }


}
