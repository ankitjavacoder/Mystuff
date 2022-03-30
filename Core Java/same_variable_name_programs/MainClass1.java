package same_variable_name_programs;

class Demo 
{
	public static int a = 10;
public static void test(){
		int a = 20;
		System.out.println(a);
		System.out.println(Demo.a);

}
}
class MainClass1{
	public static void main(String[] args) 
	{
		System.out.println("main Starts");
		Demo d1 = new Demo();
		d1.test();
		System.out.println("main ends!");
	}
}