import java.util.HashSet;

public class Q003 {

	static HashSet<Long> primes;
	static {
		primes = new HashSet<Long>();
		primes.add(2l);
	}
	
	public static void main(String[] args) {
		long x = 600851475143l;
		long largestPrimeFactor = 1;
		for(long l = 2; l  < Math.sqrt((double)x); l++) {
			if(isPrime(l) && x%l == 0) {
				largestPrimeFactor = l;
			}
		}
		System.out.println(largestPrimeFactor);
	}
	
	public static boolean isPrime(long n) {
		if(primes.contains(n))
			return true;
		for(long l : primes) {
			if(n%l == 0)
				return false;
		}
		primes.add(n);
		return true;
	}

}
