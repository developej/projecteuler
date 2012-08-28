public class problem4 {

	static int num = 0;
	static int temp = 0;
	static int rev = 0;
	static int maxpaltemp = 0;
	static int maxpal = 0;

	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				num = i * j;
				int n = num;
				while (num > 0) {
					temp = num % 10;
					num = num / 10;
					rev = rev * 10 + temp;
				}
				if (rev == n) {
					maxpaltemp = rev;
					if (maxpaltemp > maxpal) {
						maxpal = maxpaltemp;
					}
				} else {
					rev = 0;
				}
			}
		}
		System.out.println("max pal is: " + maxpal);
	}
}
