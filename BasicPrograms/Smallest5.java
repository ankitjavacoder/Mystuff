class Smallest5 
{
	public static void main(String[] args) 
	{
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 50;
		int e = 51;
		System.out.println(a<b && a<c && a<d && a<e? a+ " is smallest":(b<c && b<d && b<e)?b+ " is smallest":c<d && c<e?c+" is smallest":d<e? d+ " is smallest":e+" is smallest");
		
	}
}
