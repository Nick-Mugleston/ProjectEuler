
public class Q006 {

	public static void main(String[] args) {
		int total = (100*101/2)*(100*101/2);
		for(int i = 1; i <= 100; i++) {
			total -= i*i;
		}
		System.out.println(total);
	}

}
