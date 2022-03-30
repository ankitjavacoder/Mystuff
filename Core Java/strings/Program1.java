package strings;

public class Program1 {
	String s;
	Program1(String s){
		this.s = s;
	}
	public static void main(String[] args) {
		Program1 p1 = new Program1("ABC");
		System.out.println(p1.s);
		String s2 = new String("XYZ");
		System.out.println(s2);
	}
}
