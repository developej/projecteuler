public class problem12{
	public static void main(String[] args){
		int result = 0;
		for(int i = 1; divs(result) < 500; i++){
			result += i; 
		}
		System.out.println(result);
	}

	public static int divs(int x){
		int divisors = 0;
		for (int i = 1; i < Math.sqrt((float)x); i++){
			if (x % i == 0){
				divisors++;
			}
		}
		return 2 * divisors - 1;
	}
}
