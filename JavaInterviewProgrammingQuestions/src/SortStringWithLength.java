import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SortStringWithLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "TODO Auto-generated method stub";

		String[] str1 = str.split(" ");

		Arrays.sort(str1, (a, b) -> Integer.compare(a.length(), b.length()));

		System.out.println(Arrays.toString(str1));

		System.out.print("Smallest-  " + str1[0] + "  " + "Largest-  " + str1[str1.length - 1]);

	}

}
