import java.util.Scanner;
class multiplesofn2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n value : ");
		int n= sc.nextInt();
		for (int i=1;i<=10 ;i++ )
		{ 
			sum+=n;
		System.out.println(n+"*"+i+"="+sum);
		}
	}
}
