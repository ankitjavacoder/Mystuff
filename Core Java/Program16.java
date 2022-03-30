
public class Program16 {

	public static void main(String[] args) {
		String s = "radar";
		String rev = "";
		for(int i = (s.length())-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("its pallindrome");
		} else {
			System.out.println("its not pallindrome");
		}
	}

}
