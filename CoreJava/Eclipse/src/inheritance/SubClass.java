package inheritance;

class SuperClass1
{
static int i = 10;
}
class SubClass extends SuperClass
{
			static int j = 15;

	public static void main(String[] args) 
	{
		System.out.println("main Starts");
		System.out.println("Super class variable : "+i);
		System.out.println("Sub class variable : "+j);
		System.out.println("main ends");
	}
}
