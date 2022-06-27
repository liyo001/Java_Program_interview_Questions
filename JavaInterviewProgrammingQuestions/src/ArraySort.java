import java.util.Arrays;

public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;

		int[] str = { 90, -78, 56, 0, 12 };

		for (int i = 0; i < str.length; i++)

		{
			for (int j = i+1; j < str.length; j++)

			{

				if (str[i] > str[j]) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}

			}

		}
		System.out.print(Arrays.toString(str));}

	}

//Note