import java.util.Scanner;
class Naturalevenbetween 
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
			if (i%2==0)
			{
				System.out.println(i);
			}
			
		}
	}
}
