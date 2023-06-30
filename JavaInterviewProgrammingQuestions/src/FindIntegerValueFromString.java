import java.util.HashSet;
import java.util.Iterator;

public class FindIntegerValueFromString {

    static String str = "1sertiyjgnf540983420234wotuanAXUPXRR1542309865756";
    static HashSet<Character> set = new HashSet<>();
    static String updated = "";
    public static void main(String[] args) {
        char[] ch = str.toCharArray();
        for (Character c : ch) {
            if (Character.isDigit(c))
                set.add(c);
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            updated = updated + " " + it.next();
        }
        System.out.print(updated);

    }
}
