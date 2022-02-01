class A
{
	public void walk(){
	System.out.println("walk 5 km");
	}
}
class B extends A
{

}
class C extends A
{
	public void walk(){
	System.out.println("walk 2 km");
	}
}
class D extends A
{
	public void walk(){
	System.out.println("walk 10 km");
	}
}
class MainClass1 
{
	public static void main(String[] args) 
	{
		System.out.println(" miain starts!");
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();
		b1.walk();
		c1.walk();
		d1.walk();
		System.out.println(" miain endss!");
	}
}
