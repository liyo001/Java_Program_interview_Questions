import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class SortHashMap {

    public static HashMap<Integer, String> map= new HashMap<>();

    public static void main(String [] args)
    {
        map.put(1,"Java");
        map.put(13,"C");
        map.put(8,"Python");

        TreeMap<Integer,String> tree= new TreeMap<>(map);
         Iterator<Integer> it=tree.keySet().iterator();
         while(it.hasNext())
         {
             Integer ys=it.next();
             System.out.println("Key--" + ys +" Value--"+tree.get(ys));
         }
    }



}
