package constructor_chaining;

class Box{
	public int l;
	public int w;
	public int h;
	public Box(int l,int w){
		this.l = l;
		this.w = w;
	}
	public Box(int l,int w, int h) {
		this(l,w);
		this.h = h;
	}
	public void printDimmension() {
		System.out.println("**********----------**********");
		System.out.println("length : " + l);
		System.out.println("width : "+ w);
		System.out.println("height : " + h);
	}
}
public class MainClass4 {

	public static void main(String[] args) {
		System.out.println("main starts");
		Box b1 = new Box(10,20,30);
		Box b2 = new Box(10,20);
		Box b3 = new Box(10,20,50);
		b1.printDimmension();
		b2.printDimmension();
		b3.printDimmension();
		System.out.println("main ends");
	}
}
