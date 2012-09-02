public class problem6 {
	static int sum = 0;
	static int sumofsqs = 0;
	static int sqofsums = 0;
	static int result;

	public static void main(String[] args) {
		// sum of squares
		for (int i = 0; i < 101; i++) {
			sumofsqs += i*i;
		}
		System.out.println("Sum of squares: " + sumofsqs);

		// square of sums
		for (int i = 0; i < 101; i++) {
			sum += i;
		}
		sqofsums = sum * sum;
		System.out.println("Square of sums: " + sqofsums);

		// result
		result = sqofsums - sumofsqs;
		System.out.println("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is: " + result);
	}
}
