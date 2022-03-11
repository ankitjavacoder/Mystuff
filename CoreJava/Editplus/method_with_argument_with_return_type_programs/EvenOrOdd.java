import java.util.Scanner;
class EvenOrOdd 
{
	public static boolean check(int a)
	{
		return (a%2==0);
	}
	public static void main(String[] args) 
	{
		System.out.println("main starts!");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean k  = check(n);
		System.out.println(k);
		System.out.println("main ends!");
	}
}
