
public class RemoveCharacterFromFirstStringPresentInSecondString {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "india is great";
		String str2 = "";
		String str1 = "in";
		char[] chr = str.toCharArray();
		for (int i = 0; i < chr.length; i++)
		{
			if (str1.indexOf(chr[i]) < 0) {
				str2 = str2 + chr[i];
			}
		}
		System.out.print(str2);
	}
	}

