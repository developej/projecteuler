public class problem7 {
	static int counter = 1;

	public static void main(String[] args) {
		for (int i = 3; ; i++) {
			if (isPrime(i)) {
				counter += 1;
				if (counter == 10001) {
					System.out.println(i);
					break;
				}
			}
		}
	}

	public static boolean isPrime(int p) {
		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
}