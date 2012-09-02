public class problem9 {
	static int a;
	static int b;
	static int c;

	public static void main(String[] args) {
		label:
		for (int m = 2; ; m++) {
			for (int n = 1; ; n++) {
				if (n >= m) {
					break;
				} else {
					a = 2 * m * n;
					b = m * m - n * n;
					c = m * m + n * n;
				}
				if (a + b + c == 1000) {
					System.out.println("a = " + a);
					System.out.println("b = " + b);
					System.out.println("c = " + c);
					System.out.println("product of triplets: " + a * b * c);
					break label;
				}
			}
		}
	}
}
