package Constructor_overloading;

class Demo1 
{

	public Demo1(){
		System.out.println("In demo class container without args");
	}

	public Demo1(int i ){
		System.out.println("In demo class container with  int args");
	}
	public Demo1(boolean i ){
		System.out.println("In demo class container with  boolean args");
	}
	public Demo1(double i, int j ){
		System.out.println("In demo class container with  double and int args");
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1(10);
		Demo1 d3 = new Demo1(true);
		Demo1 d4 = new Demo1(10.2,10);
		System.out.println("main starts");
	}
}
