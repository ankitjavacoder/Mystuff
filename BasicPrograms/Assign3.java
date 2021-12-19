class Assign3 
{
	public static void main(String[] args) 
	{
		int m = 45;
		int n = 12;
		m/=n;
		m=n-m;
		m*=n;
		n+=m;
		n = (n%m) - (m%n);
		m*=n;
		System.out.println(m);
		System.out.println(n);
	}
}
