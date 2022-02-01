class Shapes
{
	public void walk(){
	System.out.println("move in clock-wise");
	}
}
class Circle extends Shapes
{

}
class Rectangle extends Shapes
{
	public void walk(){
	System.out.println("move in anti clock-wise");
	}
}
class Triangle extends Shapes
{

}
class MainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println(" miain starts!");
		Circle c1 = new Circle();
		Rectangle r1 = new Rectangle();
		Triangle t1 = new Triangle();
		c1.walk();
		r1.walk();
		t1.walk();
		System.out.println(" miain endss!");
	}
}
