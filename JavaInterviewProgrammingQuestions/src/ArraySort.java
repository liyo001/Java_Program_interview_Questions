
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;

		int[] str = { 90, -78, 56, 0, 12 };
		
		

		for (int i = 0; i < str.length; i++)

		{

			System.out.print(str[i]);
		}

		for (int i = 0; i < str.length; i++)

		{
			for (int j = i; j < str.length; j++)

			{

				if (str[i] > str[j]) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;

				}

			}

		}

		for (int i = 0; i < str.length; i++)

		{

			System.out.println(str[i]);
		}

	}

}


//Note