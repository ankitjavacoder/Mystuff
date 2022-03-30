public class Program19 {
	public static void main(String[] args) {
		String s = "mahabharat";
		String news = "";
		for(char ch = '!' ;ch <='|';ch++) {
			int count = 0;
			for(int i = 0;i < s.length();i++) {
				if (ch == s.charAt(i)) {
					count++;
				}
			}
			if (count >0 ) {
				news = news+ch;
				System.out.println(ch + " repeated "+ count +"times");
			}
		}
		System.out.println("The final string : "+ news);
	}
}