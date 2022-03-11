package inheritance;

class P 
{
	public  int i = 10;
}
class Q extends P
{
	public  int j = 20;
		public void display(){
		System.out.println("Inheritad var i = "+ i);
		System.out.println("Inheritad var j = "+ j);
	}
}
class R extends P
{
	public int k = 30;
	public void print(){
	System.out.println("Inheritad var i = "+ i);
	System.out.println("Inheritad var k = "+ k);	
	}
}
class mainClass3
{
	public static void main(String[] args) {
	System.out.println("main starts");
	Q q1 = new Q();
	q1.display();
	R r1 = new R();
	r1.print();
	System.out.println("main ends");
	}
}
