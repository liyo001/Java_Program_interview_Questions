import java.util.Iterator;
import java.util.Objects;
import java.util.TreeMap;

public class SortStringOnTheBasisOfNumbers {

    static String str = "Thi5ng mig4ht b3e chan7ged";
    static TreeMap<Character, String> map = new TreeMap<>();

    public static void main(String[] args) {
        String[] st = str.split(" ");
        String updated = "";
        for (int i = 0; i < st.length; i++) {
            char[] ch = st[i].toCharArray();

            for (Character c : ch) {
                if (Character.isDigit(c)) {
                    map.put(c, st[i].replace(c.toString(), ""));
                }
            }
            }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Object Key = it.next();
            updated = updated + " " + map.get(Key);
        }
        System.out.print(updated);
    }
}
