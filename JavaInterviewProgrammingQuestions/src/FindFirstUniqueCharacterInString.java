import java.util.HashMap;

public class FindFirstUniqueCharacterInString {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        HashMap<Character, Integer> map = new HashMap<>();

        String word = "Java";

		//first Approch
        char[] ch = word.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (map.containsKey(ch[i])) {
                map.put(ch[i], map.get(ch[i]) + 1);
            } else {
                map.put(ch[i], 1);
            }

        }

        for (int i = 0; i < ch.length; i++) {
            if (map.get(ch[i]) == 1)
                System.out.println(ch[i]);
            break;
        }

		//Second approch
		for(int i=0;i<word.length();i++)
		{
		boolean unique=true;
		for(int j=0;j<word.length();j++)
		{
			if(i!=j && word.charAt(i)==word.charAt(j))
			{
				unique=false;
			}
		}
		if(unique)
		{
			System.out.print(word.charAt(i));
			break;
		}

		}

    }

}
