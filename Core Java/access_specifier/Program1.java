package access_specifier;

public class Program1 {
private void m1() {
	System.out.println("Private is running");
}
 void m2() {
	System.out.println("default is running");
}
 protected void m3() {
		System.out.println("Protected is running");
	}
 public void m4() {
		System.out.println("Public is running");
	}
public static void main(String[] args) {
	Program1 p1 = new Program1();
	p1.m1();
	p1.m2();
	p1.m3();
	p1.m4();
	}
}
