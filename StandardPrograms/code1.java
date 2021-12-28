import java.util.Scanner;
class code1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value");
		char ch = sc.next().charAt(0);
		if (ch >='A' && ch<='Z')
		{
			int a = ch-64;
			System.out.println(a);
		}
		else System.out.println("wrong value");

	}
}
