import java.util.Scanner;
class Table 
{
	public static void table(int a)
	{
		for (int i = 1;i<=10 ;i++ )
		{
			System.out.println(a + " * "+ i+" = "+a*i);
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		table(n);
		System.out.println("main ends!");
	}
}
