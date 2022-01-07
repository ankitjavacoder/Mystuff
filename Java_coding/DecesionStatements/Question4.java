class Question4 
{
	public static void main(String[] args) 
	{
		int a = 25;
		if (a%2==0)
		{
			System.out.println("The number entered by developer is "+a+", as it's even number the value will be added by 1");
			System.out.println(++a);
		}
		else{
			System.out.println("The number entered by developer is "+a+", as it's odd number the value will be subtracted by 1");
			System.out.println(--a);
		}
	}
}
