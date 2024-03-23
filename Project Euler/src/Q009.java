
public class Q009 {

	public static void main(String[] args) {
		for(int a = 1; a <= 1000; a++) {
			for(int b = a; b <= 1000; b++) {
				if(Math.sqrt(a*a+b*b)%1==0) {
					int c = (int)(Math.sqrt(a*a+b*b));
					if(a+b+c==1000) {
						System.out.println(a*b*c);
					}
				}
			}
		}
	}
}
