import java.util.*;

public class SortHashMap {

    public static HashMap<Integer, String> map= new HashMap<>();

    public static void main(String [] args)
    {
        map.put(1,"Java");
        map.put(13,"C");
        map.put(8,"Python");
        map.put(24,"Abs");

        // sort by key
        TreeMap<Integer,String> tree= new TreeMap<>(map);
         Iterator<Integer> it=tree.keySet().iterator();
         while(it.hasNext())
         {
             Integer ys=it.next();
             System.out.println("Key--" + ys +" Value--"+tree.get(ys));
         }

         //sort by value

            List<Map.Entry<Integer,String>>list=new LinkedList<Map.Entry<Integer, String>>(map.entrySet());
         Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {
             @Override
             public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                 return o1.getValue().compareTo(o2.getValue());
             }
         });

        HashMap<Integer, String> temp = new LinkedHashMap<Integer,String>();
        for (Map.Entry<Integer,String> a: list) {
            temp.put(a.getKey(),a.getValue());
        }
        System.out.println("==================================================================");
        System.out.print(temp);

    }



}
