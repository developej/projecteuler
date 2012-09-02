public class problem2 {
	static int a = 1;
	static int b = 2;
	static int z;
	static int sum = 0;

	public static void main(String[] args) {
		for (int i = 0; i <= 1000; i++) {
			z = a + b;
			if (z > 4000000) {
				break;
			}
			a = b;
			b = z;
			if (b % 2 == 0) {
				sum = sum + b;
			}
		}
		sum = sum + 2;
		System.out.println("sum is: " + sum);
	}
}
