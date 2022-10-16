
public class RemoveDuplicateCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		String str = "JavaTpoint is the best learning website";
//
//		String newStr = new String();
//
//		for (int i = 0; i < str.length(); i++) {
//			char charAtPosition = str.charAt(i);
//
//			if (newStr.indexOf(charAtPosition) < 0) {
//				newStr = newStr + charAtPosition;
//			}
//		}
//
//		System.out.print(newStr);
		
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
