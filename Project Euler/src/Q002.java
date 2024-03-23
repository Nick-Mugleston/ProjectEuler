
public class Q002 {

	public static void main(String[] args) {
		int sum = 0;
		int[] n = {1,2};
		while(n[1] < 4_000_000) {
			if(n[1] % 2 == 0) {
				sum += n[1];
			}
			int temp = n[0];
			n[0] = n[1];
			n[1] += temp;
		}
		System.out.println(sum);
	}

}
