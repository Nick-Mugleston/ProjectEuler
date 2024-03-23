import java.util.HashSet;

public class Q010 {
	
	public static void main(String[] args) {
		HashSet<Integer> primes = new HashSet<Integer>();
		long sum = 0;
		for(int i = 2; i < 2_000_000; i++) {
			boolean isPrime = true;
			for(int x : primes) {
				if(i%x==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				primes.add(i);
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
