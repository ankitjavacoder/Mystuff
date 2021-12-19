import java.util.Scanner;
class Olxindira
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to olx online selling and purchase app");
		System.out.println("ENTER MOBILE NUMBER:");
		long mobile=sc.nextLong();
		System.out.println("ENTER MAIL ID:");
		String mail=sc.next();
		System.out.println("ENTER YOUR NAME:");
		String name=sc.next();
		//====================================================================
		//===LOGIN
		System.out.println("DO YOU WANT TO LOGIN");
		System.out.println("PRESS 1 FOR LOGIN");
		System.out.println("PRESS 2 FOR EXIT");
		int key = sc.nextInt();
		if (key==1)	
		{
			System.out.println("login");
		}
		else System.out.println("THANK YOU FOR VISITING");
	}
}