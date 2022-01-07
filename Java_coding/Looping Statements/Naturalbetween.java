import java.util.Scanner;
class Naturalbetween 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter M value");
		int m = sc.nextInt();
		System.out.println("Enter N value");
		int n = sc.nextInt();
		for (int i = n;i>=m ;i--)
		{
			System.out.println(i);
		}
	}
}
