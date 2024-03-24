import java.math.BigInteger;

public class Q012 {

	public static void main(String[] args) {
		BigInteger sum = new BigInteger("3");
		for(BigInteger i = new BigInteger("3"); factorCount(sum) < 500; i = i.add(BigInteger.ONE)) {
			sum = sum.add(i);
		}
		System.out.println(sum);
	}
	
	public static int factorCount(BigInteger b) {
		int count = 0;
		for(BigInteger i = BigInteger.ONE; i.compareTo(b.sqrt()) <= 0; i = i.add(BigInteger.ONE)) {
			if(b.mod(i).equals(BigInteger.ZERO)) {
				count += 2;
			}
		}
		if(b.sqrt().pow(2).equals(b))
			count--;
		return count;
	}

}
