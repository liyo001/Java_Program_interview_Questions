import java.util.Arrays;

public class AnagramInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "java2blog";
		String str2 = "aj2vabgol";
		int i=0;

		int len1 = str1.length();
		int len2 = str2.length();

		if (len1 == len2) {
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);

			String val1 = String.valueOf(ch1);
			Arrays.sort(ch2);

			String val2 = String.valueOf(ch2);

			if (val1.equals(val2))
				System.out.print("both strings are anagram.");
			else
				System.out.print("both strings are not anagram.");

		} else
			System.out.print("both strings are not anagram.");

	}

}
