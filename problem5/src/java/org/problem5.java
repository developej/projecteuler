import java.io.*;
import java.util.*;

public class problem5 {
	static int number;
	static int result = 1;
	static int primesum = 1;
	static ArrayList<Integer> primes = new ArrayList<>();
	static ArrayList<Integer> primesums = new ArrayList<>();

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			number = Integer.parseInt(br.readLine());
		} catch (NumberFormatException ne) {
			System.out.println("Invalid input: " + ne);
			System.exit(0);
		} catch (IOException ioe) {
			System.out.println("I/O Error: " + ioe);
			System.exit(0);
		}

		// start the timer
		System.out.println("*STARTING TIMER*");
		
		long startTime = System.nanoTime();

		// check if a number between (including) 2 and the typed in number is a prime and, if it is, add it to an arraylist 'primes'
		for (int i = 2; i <= number; i++) {
			if (isPrime(i) == true) {
				primes.add(i);
			}
		}

		// list all primes
		System.out.println("Prime numbers from 1 to " + number + " are: ");
		for (int i = 0; i < primes.size(); i++) {
			System.out.println(primes.get(i));
		}

		// check how many times each prime is contained in a typed in number. when a number greater than typed in number is hit, 
		// add the previous one to an arraylist 'primesums'
		for (int i : primes) {
			primesum = i;
			while (primesum < number) {
				if (primesum * i > number) {
					break;
				}
				primesum *= i;
			}
			primesums.add(primesum);
		}

		// list all primesums
		for (int i = 0; i < primesums.size(); i++) {
			System.out.println("primesums: " + primesums.get(i));
		}

		// multiply all elements in primesums and get the result
		for (int i : primesums) {
			result = result * i;
		}

		// print the result
		System.out.println("The smallest positive number evenly divisible by all numbers from 1 to " + number + " is: " + result);

		// end the timer
		long timeElapsed = System.nanoTime() - startTime;
		System.out.println("*TIMER STOPPED*");
		System.out.println("TiME ELAPSED: " + timeElapsed);
	}

	// a method for finding prime numbers
	public static boolean isPrime(int p) {
		for (int i = 2; i < p; i++) {
			if (p % i == 0) {
				return false;
			}
		}
		return true;
	}
}
