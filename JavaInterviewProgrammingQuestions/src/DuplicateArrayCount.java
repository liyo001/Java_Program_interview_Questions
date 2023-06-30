import java.util.*;
import java.util.stream.Collectors;

public class DuplicateArrayCount
{
    public static void main(String[]args)
    {
        Integer[] arr= {3,4,9,5,2,3,9,11,25,15,11};

        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
            else
                map.put(arr[i],1);
        }

         Iterator it=map.keySet().iterator();

        while(it.hasNext())
        {
            Integer ys= (Integer) it.next();

            if(map.get(ys)>1)
            System.out.println("Keys "+ ys+" Values "+map.get(ys));
        }


        // using JAVA 8 Stream
        Set<Integer> items = new HashSet<>();
    List<Integer> list = Arrays.asList(5, 3, 4, 1, 3, 7, 2, 9, 9, 4);

    Set<Integer> result = list.stream().filter(n -> !items.add(n)).collect(Collectors.toSet());

        Object [] its=result.toArray();
        System.out.print(Arrays.toString(its));

}

}
