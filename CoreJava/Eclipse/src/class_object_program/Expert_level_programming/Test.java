package class_object_program.Expert_level_programming;

class anotherTest{

}
class Test 
{
	public void testing(int a ,int b){
	System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		Test b = new Test();
		b.testing(1,2);
		Test c = new Test();
		c.testing(2,5);	
	}
}
