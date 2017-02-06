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
        Map<String, Integer> map = new HashMap<String, Integer>();

        //"salad": "oil", "potato": "ketchup"
        //map.put("salad", "oil");
        //map.put("potato", "ketchup");
        //map.put("c", "meh");

        String[] strArray = new String[]{"aa", "bb", "cc", "aAA", "cCC", "d"};

        Map1 map1 = new Map1();
        map = map1.word0(strArray);

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();                      //ключ
            String value = pair.getValue();                  //значение
            System.out.println(key + ":" + value);
        }
    }

    public Map<String, String> word0(String[] strings) {
        Map<String, String> map = new HashMap<String, String>();
        for (String string : strings) {
            String str = new String(string.substring(0,1));
            if (map.containsKey(str)) {
                map.put(str, map.get(str)+string);
            }
            else {
                map.put(str, string);
            }
        }
        return map;
    }

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

}
