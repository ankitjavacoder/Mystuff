class Run1 
{
	public static int i = 10;
	public int j = 20;

	public static void main(String[] args) 
	{
		System.out.println("main starts");
		System.out.println("main ends");
		System.out.println(i);
		Run1 o1 = new Run1();
		Run1 o2 = new Run1();
		Run1 o3 = new Run1();
		System.out.println(o1.j);
		System.out.println(o2.j);
		System.out.println(o3.j);

	}
}
