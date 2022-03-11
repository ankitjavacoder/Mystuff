package inbuilt_library;

public class Program1 {

	String s ;
	Program1(String s){
		this.s = s;
	}
	public static void main(String[] args) {
		Program1 p = new Program1("Hello");
		System.out.println(p.toString());
	}
	public String toString() {
		return s;
	}
}
