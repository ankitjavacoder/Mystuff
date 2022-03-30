
public class Program17 {

	public static void main(String[] args) {
		String s = "Hello";
		for(char ch = 'a' ;ch <='z';ch++) {
			int count = 0;
			for(int i = 0;i < s.length();i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			if (count>1) {
				System.out.println(ch + " repeated "+ count +"times");
			}
		}
	}

}
