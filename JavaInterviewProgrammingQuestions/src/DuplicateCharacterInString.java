import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tarunar";

		Set<Character> set = new LinkedHashSet<Character>();

		for (int i = 0; i < str.length(); i++) {

			Character ch = str.charAt(i);

			if (set.contains(ch)) {
				System.out.print(ch);
			} else {
				set.add(ch);
				
			}

		}
		
		
//		Iterator<Character> namesIterator = set.iterator();
//		
//		while(namesIterator.hasNext()) {
//			   System.out.println(namesIterator.next());
//			}
		
		//set.stream().forEach(System.out::println);

	}

// Using Hashmap

//	
//	Map<Character, Integer> map= new HashMap<>();
//	
//	char[] chars = str1.toCharArray();
//	
//	for(Character ch:chars)
//	  {
//		if(map.containsKey(ch))
//		{
//			map.put(ch, map.get(ch)+1);
//		}
//		else {
//			map.put(ch, 1);
//		}
//		
//	  }
//	
//	Set<Character> keys = map.keySet();
//	
//	for(Character ch1:keys){
//	      if(map.get(ch1) > 1){
//	        System.out.println("Char "+ch1+" "+map.get(ch1));
//	      }
//	    }
//
//}
}
