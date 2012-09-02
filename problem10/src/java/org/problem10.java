public class problem10 {
	public static void main(String[] args) {
		boolean[] isPrime = listPrimality(2000000);
		long sum = 0;
		for (int i = 0; i < isPrime.length; i++) {
			if (isPrime[i]) {
				sum += i;
			}
		}
		System.out.println(sum);
	}

	public static boolean[] listPrimality(int n) {
		if (n < 0)
			throw new IllegalArgumentException();
		boolean[] prime = new boolean[n + 1];
		if (n >= 2)
			prime[2] = true;
		for (int i = 3; i <= n; i += 2)
			prime[i] = true;
		// Sieve of Eratosthenes
		for (int i = 3, end = sqrt(n); i <= end; i += 2) {
			if (prime[i] && (long)i * i <= n) {
				for (int j = i * i; j <= n; j += i << 1)
					prime[j] = false;
			}
		}
		return prime;
	}

	public static int sqrt(int x) {
		if (x < 0)
			throw new IllegalArgumentException("Square root of negative number");
		int y = 0;
		for (int i = 32768; i != 0; i >>>= 1) {
			y |= i;
			if (y > 46340 || y * y > x)
				y ^= i;
		}
		return y;
	}
/*
 *    // takes too long, needs sieve
 *    static long sum = 0;
 *
 *    public static void main(String[] args) {
 *        for (int i = 2; i < 2000001; i++) {
 *            if (isPrime(i)) {
 *                sum += i;
 *            }
 *        }
 *        System.out.println("Sum of all primes below 2M is: " + sum);
 *    }
 *
 *    // a method for finding prime numbers
 *    public static boolean isPrime(long p) {
 *        if (p == 1) {
 *            return false;
 *        }
 *        if (p == 2) {
 *            return true;
 *        }
 *        for (int i = 3; i < p; i++) {
 *            if (p % i == 0) {
 *                return false;
 *            }
 *        }
 *        return true;
 *    }
 */
}
