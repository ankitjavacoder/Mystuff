import java.util.Scanner;
class scanner 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter ");
		int x = scan.nextInt();
		switch (x)
		{
		case 1: System.out.println("You have entered 1");break;
		
		case 2: System.out.println("You have entered 2");break;
		default : System.out.println("You have entered Something wrong");
		}
	}
}
