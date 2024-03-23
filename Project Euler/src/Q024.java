import java.util.LinkedList;

public class Q024 {
	
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		System.out.println(getIthPermutation(list,1000000,0));
	}
	    
	public static String getIthPermutation(LinkedList<Integer> list, int i, int depth) {
		if(list.isEmpty())
			return "";
		if(i > factorial(list.size()-1)) {
			return getIthPermutation(list,i-factorial(list.size()-1),depth+1);
		}
		return list.remove(depth) + getIthPermutation(list,i,0);
	}
	    
	public static int factorial(int n) {
		int total = 1;
		for(int i = 1; i <= n; i++) {
			total *= i;
		}
		return total;
	}
}