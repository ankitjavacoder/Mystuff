package inheritance;

class SuperClass
{
static int i = 10;
}
class SubClass1 extends SuperClass
{
			static int j = 15;
}
class SubClass2 extends SubClass1
{
	static int k = 20;
	public static void main(String[] args) 
	{
		System.out.println("main Starts");
		System.out.println("Super class variable : "+i);
		System.out.println("Sub class1 variable : "+j);
		System.out.println("Sub class2 variable : "+ k);
		System.out.println("main ends");
	}
}
