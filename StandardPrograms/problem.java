//w p to wether a given value is 
//if upper case aplhabets print ascii values,
//if lower case alphabets check vowel or not,
//if it is a digit check ascii is even or not
// if it is a speicial character print the next character
import java.util.Scanner;
class  problem
{
	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the value");
		char a = sc.next().charAt(0);
		if (a>='A' && a<='Z')
		{
			int value = a; 
			System.out.println(value);
		}
		else if (a>='a' && a<='z')
		{
			if (a == 'a' || a=='e' || a=='i'|| a=='o'||a=='u')
			{
				System.out.println(a+ " is vowel");
			}
			else System.out.println(a + " is not vowel");
		}
		else if (a>='0' && a<='9')
		{

			int digitvalue = a;
			if (digitvalue%2 == 0)
			{
				System.out.println(digitvalue +" is even");
			}
				else if (digitvalue % 2 == 1)
				{
				System.out.println(digitvalue +" is odd");
				}
		}
		else if (a >= '!' && a<='@')
		{
			char ch = a;
			 int b = a+1;
			 ch = (char)b;

			System.out.println(ch);
		}
		else System.out.println("Wrong entered");
	}
}
