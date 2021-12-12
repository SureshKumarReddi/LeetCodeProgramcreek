package Arrays;

public class CandyDemo {

	public static void main(String[] args) {
		int[] ratings = { 1, 0, 2 };
		int candy = candy(ratings);
		System.out.println("Candies " +candy);
	}

	public static int candy(int[] ratings) {
		if (ratings == null || ratings.length == 0)
			return 0;

		int[] candies = new int[ratings.length];

		// first child gets 1 bcoz we don't no the rating the of the child
		candies[0] = 1;

		for (int i = 1; i < ratings.length; i++) {
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			} else {
				candies[i] = 1;

			}
		}

		int result = candies[ratings.length - 1];
		// from right to left
		for (int i = ratings.length - 2; i >= 0; i--) {
			int cur = 1;
			if (ratings[i] > ratings[i + 1]) {
				cur = candies[i + 1] + 1;
			}
			result = result + Math.max(cur, candies[i]);
			candies[i] = cur;
		}

		return result;
	}
}
