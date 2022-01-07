import java.util.Scanner;
class RoyalEnfield 
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("===WELCOME TO ROYALENFIED APP===");
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
		System.out.println("--select the model--");
		String model=sc.next();
		switch(model)
		{ 
			case"clasic350":{
				System.out.println("colours:black/red/white/silver");
				System.out.println("cc:350");
				System.out.println("Please select accessories 'acc1' or 'acc2'");
				String acc = sc.next();
				switch (acc)
				{
				case "acc1": System.out.println("you have choosen acc 1");break;
				case "acc2": System.out.println("you have choosen acc 2");break;
				default : System.out.println("Incorrect acc");
				}
				System.out.println( acc+" Selected");
				System.out.println("final cost :2.25 lcs only");
				System.out.println("Thank you for your intreast...!!");
				break;
			}
			case"Himalaya":{
				System.out.println("colours:black/red/white/silver/green");
				System.out.println("cc:410");
				System.out.println("cost:3.5lcs");
				System.out.println("Thank you for your intrest...!!");
				break;
			}
			case"Thuderbird":{
				System.out.println("colour:black/red/white/silver/yellow");
				System.out.println("cc:350");
				System.out.println("cost:2.25lcs");
				System.out.println("Thank you for your intrest..!!");
				break;
			}
            default:System.out.println("==invalid "+model+"model name==");
			}
	
	}else System.out.println("----Invalid user name(or)password----");
	
}else System.out.println("Thank you for visiting our website");

}
}