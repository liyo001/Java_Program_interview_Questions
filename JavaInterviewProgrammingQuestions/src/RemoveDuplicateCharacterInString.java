import java.util.HashSet;

public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Java bast bast learning Java website Point";

		String []arr= str.split(" ");

		String updateStr= new String();
		HashSet<String> set= new HashSet<>();
		for(String yt: arr)
		{
			if(set.add(yt))
				updateStr= updateStr+" "+yt;
		}
			System.out.println(updateStr);
		
		// Remove duplicate words from string.

		String mrt = "Java bast bast learning Java website Point";

		String[] dr = mrt.split(" ");
		String newStr1 = new String();
		for (int k = 0; k < dr.length; k++)
		{

			if (newStr1.indexOf(dr[k]) < 0) {
				newStr1 = newStr1 +" "+ dr[k];
			}
		}

		System.out.println(newStr1);




	}

}
