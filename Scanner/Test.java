
class Test
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println("Hello World1111!");
	}
}
