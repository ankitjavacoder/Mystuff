package constructor_chaining;

public class MainClass5 {
	public static void main(String[] args) {
		System.out.println("main starts");
		Developer d1 = new Developer(12,"Ankit",25000.0,"Java");
		Testing t1 = new Testing(12,"Venkatesh",15000.0,"SQL");		
		d1.print();
		t1.print();
		System.out.println("main ends");
	}
}
