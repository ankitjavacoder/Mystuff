import java.util.Scanner;
class OlxMounica
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("===WELCOME OLX APP===");
		System.out.println("--SIGN UP--");
		System.out.println("-^Enter Details^-");
		System.out.println("Enter name:");
		String name=sc.next();
		System.out.println("Enter the mobile number :");
		long mobile=sc.nextLong();
		System.out.println("Enter the email id :");
		String mail=sc.next();
		System.out.println("Enter the user name:");
String uname=sc.next();
System.out.println("Enter the password:");
int psw =sc.nextInt();
System.out.println("do you want to login....!!");
System.out.println("press 1 for login");
System.out.println("press 2 to exit");
int key =sc.nextInt();
if (key==1)
{
	System.out.println("Enter the USER NAME:");
	String user_name=sc.next();
	System.out.println("Enter the PASSWORD:");
	int user_pass=sc.nextInt();

	if (uname.equals(user_name)&&psw==user_pass)
	{
		System.out.println("--login successfull--");
		System.out.println("--select the TYPE --");
		System.out.println("--type 'forsale' for sale--");
		System.out.println("--type 'buycar' for buying car and type 'buymotarcycle' to buy bike--");
		String details = sc.next();
		switch(details)
		{
			case"forsale":{
			System.out.println("--product name--");
			System.out.println("--cost--");
			System.out.println("colours:black/red/white/silver");
			break;
			}
		
			case"buycar":{
				System.out.println("colours:black/red/white/silver");
				System.out.println("maruthi baleno,swift desire,");
				System.out.println("cost :5lcs");
				System.out.println("Thank you for your intreast...!!");
				break;
			}
			case"buymotarcycle ":{
				System.out.println("colours:black/red/white/silver/green");
				System.out.println("activa,tvs,ola bikes");
				System.out.println("cost:1lcsto2lcs");
				System.out.println("Thank you for your intrest...!!");
				break;
			}
		}
	}

else

	System.out.println("Thank you for visiting our website");
    }
	}
}