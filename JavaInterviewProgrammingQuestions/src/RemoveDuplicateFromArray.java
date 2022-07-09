import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer arr[] = { 10, 20, 20, 30, 30, 40, 40, 60 };

		int n = arr.length;

		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j] = arr[i];
				j++;
			}
		}

		arr[j] = arr[n - 1];

		for (int i = 0; i < j + 1; i++) {
			System.out.println(arr[i]);

		}

		// Using Stream of java 8
//		List<Integer> list= Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
//		
//		System.out.println(list);
		
		//Using hashset also we can remove the deuplicate array.

	}

}
