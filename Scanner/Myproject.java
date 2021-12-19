import java.util.Scanner;
class Myproject 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("=== Welcome to OLX ===");
		System.out.println("Hello...visitor...");
		System.out.println("May I know your name, please");
		String name = sc.nextLine();
		System.out.println("Hello "+name + ". Hope you are doing good today");
		System.out.println("Lets create your account... "+ name+". It wont take much time...");
		System.out.println("Please enter your Mobile number : ");
		long num = sc.nextLong();
		System.out.println("Please enter your mail id : ");
		String mail = sc.next();
		System.out.println("Please enter your user name : ");
		String uname = sc.next();
		System.out.println("Please enter your password(No space are allowed): ");
		String psw = sc.next();
		System.out.println("Thank you for joining with us ");
		System.out.println("Please 1 for login");
		System.out.println("Please 2 for Exit");
		int key = sc.nextInt();
		if (key == 1)
		{
			System.out.println("Please enter user name");
			String user_name = sc.next();
			System.out.println("Please enter password");
			String user_psw = sc.next();
			if (uname.equals(user_name) && psw.equals(user_psw))
			{
				System.out.println("Logged in Sucessfully");
				System.out.println("Please select the category 'Car' or 'Bike'");
				String ctgry_user = sc.next();
				switch (ctgry_user)
				{
				case "Car": {
							System.out.println("Please select the Car name 'Swift' or 'Baleno'");
							String ctgry_car = sc.next();
							switch (ctgry_car)
							{
							case "Swift" : System.out.println("You have selected Swift");
											System.out.println("Color : Black");
											System.out.println("Model : Manaul Gear");
											System.out.println("Cost : 6.5 Lakhs only");
											System.out.println("Please Select the mode of Payment : 'Card' or 'UPI' or 'NetBanking'");
											String pymnt = sc.next();
											switch (pymnt)
											{
											case "Card": System.out.println("Okay, Payment will be done through Card, redirecting to payment page");
											System.out.println("Thank you for purchasing Swift");break;
											case "UPI": System.out.println("Okay, Payment will be done through UPI, redirecting to payment page");
											System.out.println("Thank you for purchasing Swift");break;
											case "NetBanking": System.out.println("Okay, Payment will be done through NetBanking, redirecting to payment page");
											System.out.println("Thank you for purchasing Swift");break;
											default : System.out.println("There is not Such payment mode available");break;
											}
							break;
							case "Baleno" : System.out.println("You have selected Baleno");
											System.out.println("Color : Blue");
											System.out.println("Model : Automatic Gear");
											System.out.println("Cost : 9 Lakhs Only");
											System.out.println("Please Select the mode of Payment : 'Card' or 'UPI' or 'NetBanking'");
											String pymnt1 = sc.next();
											switch (pymnt1)
											{
											case "Card": System.out.println("Okay, Payment will be done through Card, redirecting to payment page");
											System.out.println("Thank you for purchasing Baleno");break;
											case "UPI": System.out.println("Okay, Payment will be done through UPI, redirecting to payment page");
											System.out.println("Thank you for purchasing Baleno");break;
											case "NetBanking": System.out.println("Okay, Payment will be done through NetBanking, redirecting to payment page");
											System.out.println("Thank you for purchasing Baleno");break;
											default : System.out.println("There is not Such payment mode available");break;
											}break;

							default : System.out.println(ctgry_car+" not found");break;
							}break;
							}
				case "Bike": {
							System.out.println("Please select the Bike name 'Shine' or 'Discover'");
							String ctgry_bike = sc.next();
							switch (ctgry_bike)
							{
							case "Shine": System.out.println("You have selected Shine");
							System.out.println("Color : Black and Silver");
											System.out.println("Model : BS - IV");
											System.out.println("Cost : 92 Thousand Only");
											System.out.println("Please Select the mode of Payment : 'Card' or 'UPI' or 'NetBanking'");
											String pymnt2 = sc.next();
											switch (pymnt2)
											{
											case "Card": System.out.println("Okay, Payment will be done through Card, redirecting to payment page");
											System.out.println("Thank you for purchasing Shine");break;
											case "UPI": System.out.println("Okay, Payment will be done through UPI, redirecting to payment page");
											System.out.println("Thank you for purchasing Shine");break;
											case "NetBanking": System.out.println("Okay, Payment will be done through NetBanking, redirecting to payment page");
											System.out.println("Thank you for purchasing Shine");break;
											default : System.out.println("There is not Such payment mode available");break;
											}break;
							
							case "Discover": System.out.println("You have selected Discover");
											System.out.println("Color : Black and Red");
											System.out.println("Model : BS- V");
											System.out.println("Cost : 98 Thousand Only");
											System.out.println("Please Select the mode of Payment : 'Card' or 'UPI' or 'NetBanking'");
											String pymnt3 = sc.next();
											switch (pymnt3)
											{
											case "Card": System.out.println("Okay, Payment will be done through Card, redirecting to payment page");
											System.out.println("Thank you for purchasing Disover");break;
											case "UPI": System.out.println("Okay, Payment will be done through UPI, redirecting to payment page");
											System.out.println("Thank you for purchasing Discover");break;
											case "NetBanking": System.out.println("Okay, Payment will be done through NetBanking, redirecting to payment page");
											System.out.println("Thank you for purchasing Discover");break;
											default : System.out.println("There is not Such payment mode available");break;
											}break;
							default : System.out.println(ctgry_bike+"Not found");break;
							}break;
							}
				default : System.out.println(ctgry_user+"Not found");break;
				}
			}
	else System.out.println("Invalid Details...");

} else System.out.println("Thank you for visiting ");
}
}
