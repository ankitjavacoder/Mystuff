package generalization;
class shape {
	public void fill() {
		System.out.println("fill with color");
	}
	public void outline() {
		System.out.println("outlines with different thickness");
	}
	public void rotate() {
		System.out.println("rotate in clock-wise");
	}
}
class circle extends shape{
	
}
class rect extends shape{
	
}
class tri extends shape{
	
}
 class MainClass1 {

	public static void main(String[] args) {
		System.out.println("main starts");
		circle c1 = new circle();
		tri t1 = new tri();
		rect r1 = new rect();
		c1.fill();
		c1.outline();
		c1.rotate();
		r1.fill();
		r1.rotate();
		r1.outline();
		t1.outline();
		t1.fill();
		t1.rotate();
		System.out.println("mainends");
	}
 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

