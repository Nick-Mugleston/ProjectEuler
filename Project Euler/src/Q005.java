import java.util.HashMap;

public class Q005 {

	public static void main(String[] args) {
		long sum = 1;
		HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
		for(int i = 20; i > 0; i--) {
			int x = i;
			for(int j = 2; j <= x; j++) {
				int count = 0;
				while(x%j==0) {
					count++;
					x/=j;
				}
				if(count > 0) {
					if(!h.containsKey(j)) {
						h.put(j, count);
						sum *= Math.pow(j, count);
					}
					else if(count > h.get(j)) {
						sum /= Math.pow(j, h.get(j));
						h.put(j, count);
						sum *= Math.pow(j, count);
					}
				}
			}
		}
		System.out.println(sum);
	}

}
