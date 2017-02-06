import java.util.HashMap;
import java.util.Map;

/**
 * Created by pm-01 on 03.02.2017.
 */
public class Map1 {
    public static void main(String[] args) {
        /*
        mapBully({"b": "dirt", "a": "candy"}) > {"b": "candy", "a": ""}
        mapBully({"a": "candy"}) > {"b": "candy", "a": ""}
        mapBully({"b": "carrot", "c": "meh", "a": "candy"}) > {"b": "candy", "c": "meh", "a": ""}
        */

        //Map<String, String> map = new HashMap<String, String>();
        //Map<String, Integer> map = new HashMap<String, Integer>();
        Map<String, Boolean> map = new HashMap<String, Boolean>();

        //"salad": "oil", "potato": "ketchup"
        //map.put("salad", "oil");
        //map.put("potato", "ketchup");
        //map.put("c", "meh");

        String[] strArray = new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"};
        String[] strArrayOut = new String[strArray.length];

        Map1 map1 = new Map1();
        strArrayOut = map1.allSwap(strArray);
        //System.out.println(result);
        String div = "";
        for (int i = 0; i < strArrayOut.length; i++) {
            System.out.print(div + strArrayOut[i]);
            div = ", ";
        }
        System.out.println();
/*
        for (Map.Entry<String, Boolean> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            Boolean value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
*/
    }

    public String[] allSwap(String[] strings) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 0; i < strings.length; i++) {
            String firstChar = new String(strings[i].substring(0, 1));
            if (map.containsKey(firstChar)) {
                if (map.get(firstChar) != -1) {
                    String helpStr = strings[i];
                    strings[i] = strings[map.get(firstChar)];
                    strings[map.get(firstChar)] = helpStr;
                    map.put(firstChar, -1);
                }
            }
            else {
                map.put(firstChar, i);
            }
        }

        return strings;
    }
/*
    public Map<String, String> mapBully(Map<String, String> map) {
        if (map.containsKey("potato")) {
            String value = map.get("potato");
            map.put("fries", value);
        }

        if (map.containsKey("salad")) {
            String value = map.get("salad");
            map.put("spinach", value);
        }

        return map;
    }
*/
}
