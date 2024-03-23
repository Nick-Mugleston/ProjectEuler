
public class Q004 {

	public static void main(String[] args) {
		int max = 0;
		for(int i = 100; i <= 999; i++) {
			for(int j = i; j <= 999; j++) {
				if(isPalindrome(i*j+"")) {
					if(i*j > max)
						max = i*j;
				}
			}
		}
		System.out.println(max);
	}
	
	public static boolean isPalindrome(String s) {
		for(int i = 0; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length()-1-i))
				return false;
		}
		return true;
	}

}
