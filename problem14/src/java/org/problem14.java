public class problem14 {
	static long maxi;
	static long count;
	static long temp;
	static long longest;
	public static void main(String[] args) {
		for (long i = 1; i < 1000000; i++) {
			temp = i;
			while (temp != 1) {
				if (temp % 2 == 0) {
					temp /= 2;
					count +=1;
				} else {
					temp = 3 * temp + 1;
					count += 1;
				}
			}
			if (count > longest) {
				longest = count;
				maxi = i;
			}
			count = 0;
		}
		System.out.println(maxi);
	}
}
