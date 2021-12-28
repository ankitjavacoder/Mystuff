import java.util.Scanner;
class  Perfectsquare
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		int i=sc.nextInt();
		boolean status= false;
		for (int m=1;m<=i/2;m++ )
		{
			if (m*m==i)
			{
	          status=true;
			  break;
			}
		}
		if (status)
		{
			System.out.println(i+"is  a perfect square");
		}
		else 
			System.out.println(i+"is not a perfect square");
	}
}