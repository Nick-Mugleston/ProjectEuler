import java.util.HashSet;

public class Q007 {

	public static void main(String[] args) {
		HashSet<Integer> primes = new HashSet<Integer>();
		for(int i = 2;; i++) {
			boolean isPrime = true;
			for(int x : primes) {
				if(i%x==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				primes.add(i);
			if(primes.size() == 10001) {
				System.out.println(i);
				break;
			}
		}
	}

}
