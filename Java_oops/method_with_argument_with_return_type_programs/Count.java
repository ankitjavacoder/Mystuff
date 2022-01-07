import java.util.Scanner;
class Count 
{
	public static int  count = 0;
	public static int countdigits(int a)
	{
		while (a!=0)
		{
			count = count +1 ;
			a= a/10;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result = countdigits(n);
		System.out.println(result);
		System.out.println("main ends!");
	}
}
