import java.util.Scanner;
class Ucabwmn 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the m value");
		char m=sc.next().charAt(0);
		System.out.println("enter the n value");
		char n=sc.next().charAt(0);
		if(m>='A'&&m<='z'&&n>='A'&&n<='z')
		{
			for (char ch=m;ch>=n ; ch++)
			{
				System.out.println("ch");
			}
		}
					else System.out.println("invalid input");

	}
}