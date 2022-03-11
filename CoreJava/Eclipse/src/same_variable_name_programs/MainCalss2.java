package same_variable_name_programs;

class Sample
{
	/* Non Static Variable*/
	public int k = 100;
	public void test(){
	int k = 99;
	System.out.println(k);
	System.out.println(this.k);
	}
}
class MainCalss2 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		Sample s1 = new Sample();
		s1.test();
		System.out.println("main ends!");	
	}
}
