
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Tarun";

		String rvs = "";
		char[] ch = str.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			rvs = rvs + ch[i];
		}

		System.out.print(rvs);
	}

}
