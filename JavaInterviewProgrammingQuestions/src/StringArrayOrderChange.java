import java.util.Arrays;
import java.util.Comparator;

public class StringArrayOrderChange {

	public static void main(String[] args) {

		String[] countries = { "Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark",
				"France", "Netherlands", "Italy", "Germany" };
		
//		String[] countries= {"90","12","0","-8","40"};

		int size = countries.length;

		String temp;

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-1; j++)

			{
				if (countries[j].compareTo(countries[j+1]) > 0)
				{
					temp = countries[j];
					countries[j] = countries[j+1];
					countries[j+1] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(countries));
//
//
		Object[] at=Arrays.asList(countries).stream().sorted().toArray();

		System.out.print(Arrays.toString(at));
	}

}

//Note: change in if condition greaterthan and lessthan change the order of string array.

