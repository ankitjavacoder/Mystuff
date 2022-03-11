package Constructor_overloading;

class Demo 
{

	public Demo(){
		System.out.println("In demo class container without args");
	}

	public Demo(int i ){
		System.out.println("In demo class container with  int args");
	}
	public Demo(boolean i ){
		System.out.println("In demo class container with  boolean args");
	}
	public Demo(double i, int j ){
		System.out.println("In demo class container with  double and int args");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Demo d1 = new Demo();
		Demo d2 = new Demo(10);
		Demo d3 = new Demo(true);
		Demo d4 = new Demo(10.2,10);
		System.out.println("main starts");
	}
}
