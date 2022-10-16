
public class FindTextOccuringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Tarun and Ankur are having sandwich and the vlue and define";

		String str1 = "and";

		int j = 0;

		String[] st = str.split(" ");

		for (int i = 0; i < st.length; i++)

		{

			if (st[i].equals(str1))
				j++;

		}

		System.out.print(j);

	}

}
