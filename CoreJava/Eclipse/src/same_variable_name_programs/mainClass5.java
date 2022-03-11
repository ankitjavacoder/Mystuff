package same_variable_name_programs;

class Circle
{
	public static double pi = 3.14;
	public int r;
	public Circle(int r){
		this.r = r;
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
