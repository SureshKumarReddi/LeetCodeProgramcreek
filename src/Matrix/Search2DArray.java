package Matrix;

public class Search2DArray {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11}
		};
		int target = 7;
		searchMatrix(matrix,target);
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;

		int m = matrix.length;
		int n = matrix[0].length;

		int start = 0;
		int end = m * n - 1;

		while (start <= end) {
			int mid = (start + end) / 2;
			int midX = mid / n;
			int midY = mid % n;

			if (matrix[midX][midY] == target)
				return true;

			if (matrix[midX][midY] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}

		return false;
	}
}
//links for sbmultipledb example
//https://java2novice.com/spring-boot/configure-multiple-datasources/
//https://www.javadevjournal.com/spring-boot/multiple-data-sources-with-spring-boot/
//https://medium.com/@joeclever/using-multiple-datasources-with-spring-boot-and-spring-data-6430b00c02e7