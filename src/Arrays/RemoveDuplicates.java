package Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 4, 4, 5, 5, 6, 6, 7 };
		int c = removeDuplicates(arr);
		System.out.println();
		System.out.println("printing from main method");
		for (int i = 0; i < c; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	private static int removeDuplicates(int[] arr) {
		// 1.brutce force approach
		int k = 0;
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {

			if (arr[i] != arr[i + 1]) {
				count += 1;
				arr[k] = arr[i];
				k++;
			}
		}
//i have added comment
		for (int i = 0; i < count; i++) {
			System.out.print(arr[i] + " ");

		}
		return count;
	}

}
