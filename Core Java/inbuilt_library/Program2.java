package inbuilt_library;

public class Program2 {
	int i;
	Program2(int i){
		this.i = i;
	}
	public static void main(String[] args) {
		Program2 p2 = new Program2(20);
		Program2 p3 = new Program2(20);		
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p2.i);
		System.out.println(p3.i);
	}
	//public int hashCode() {
	//	return i;
	//}
}
