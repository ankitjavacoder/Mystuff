package method_access_method;

class circle{
	public static double pi = 3.14;
	public int r;
	public void PrintArea(){
	System.out.print("Area of circle is ");
	System.out.println(pi*r*r);
}
}
class MainClass {
	public static void main(String[] args) {
		circle d1 = new circle();
		circle d2 = new circle();
		circle d3 = new circle();
		d1.r = 7;
		d2.r = 10;
		d3.r = 12;
		d1.PrintArea();
		d2.PrintArea();
		d3.PrintArea();
	}
}
