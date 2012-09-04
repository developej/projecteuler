import java.math.*;

public class problem16 {
	static BigInteger num = new BigInteger("2");
	static int exp = 1000;
	static BigInteger prod = BigInteger.ZERO;
	static BigInteger multiply = new BigInteger("2");
	static BigInteger mod = new BigInteger("10");
	static BigInteger temp = BigInteger.ZERO;
	static BigInteger sum = BigInteger.ZERO;
	public static void main(String[] args) {
		prod = num.pow(exp);
		System.out.println(prod);
		while (prod.signum() == 1) {
			temp = prod.mod(mod);
			prod = prod.divide(mod);
			sum = sum.add(temp);
		}
		/*
		 *for (int i = 1; i < 1000; i++) {
		 *    num = num.multiply(multiply);
		 *}
		 *System.out.println(num);
		 *while (num.signum() == 1) {
		 *    temp = num.mod(mod);
		 *    num = num.divide(mod);
		 *    sum = sum.add(temp);
		 *}
		 */
		System.out.println(sum);
	}
}
