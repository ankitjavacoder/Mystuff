class Largest5 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 10;
		int c = 30;
		int d = 50;
		int e = 51;
		System.out.println(a>b && a>c && a>d && a>e? a+ " is largest":(b>c && b>d && b>e)?b+ " is largest":c>d && c>e?c+" is largest":d>e? d+ " is largest":e+" is largest");
		
	}
}
