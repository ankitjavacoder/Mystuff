package class_object_program.Expert_level_programming;

class Sample
{
	public Sample(int i ){
	System.out.println("Sample constructor with args : "+i);
	}
}
class mainClass2 
{
	public static void main(String[] args) 
	{
		System.out.println("main starts");
		Sample s1 = new Sample(1);
		Sample s2 = new Sample(10);
		Sample s3 = new Sample(17);
		System.out.println("main ends");	
	}
}
