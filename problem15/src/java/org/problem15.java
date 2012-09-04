import java.math.BigInteger;

public class problem15 {
	public static void main(String[] args) {
		long[][] grid = new long[20][20];
		long total = 0;
		for (int i = 0; i < grid.length; i++) {
			grid[0][i] = 1;
			grid[i][0] = 1;
			total += 2;
		}
		for (int i = 1; i < grid.length; i++) {
			for (int j = 1; j < grid.length; j++) {
				grid[i][j] = (grid[i - 1][j] + grid[i][j - 1]);
				total += grid[i][j];
			}
		}
		System.out.println(BigInteger.valueOf((long)total));
	}
}
