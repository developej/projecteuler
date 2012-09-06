public class problem3 {
	public static void main(String[] args) {
		System.out.println(lpm(600851475143L));
	}

	public static long lpm(long num) {
		long i;
		for (i = 2; i <= num; i++) {
			if (num % i == 0) {
				num /= i;
				i--;
			}
		}
		return i;
	}
}
