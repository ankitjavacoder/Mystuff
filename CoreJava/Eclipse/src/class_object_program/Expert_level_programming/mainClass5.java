package class_object_program.Expert_level_programming;

class Circle
{
	public static double pi = 3.14;
	public int r;
	public Circle(int a){
		r = a;
	}
	public void PrintArea(){
		System.out.println("The area of Circle with radius "+ r+ " is "+ " " + pi*r*r);
}
}
class mainClass5 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Circle c1 = new Circle(10);
		c1.PrintArea();
		System.out.println("main ends");
}
}
