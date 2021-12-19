import java.util.Scanner;
class Project1 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("-------Welcome to Royal Enfield");
		System.out.println("---Sign up---");
		System.out.println("Enter the Details :");
		System.out.println("Enter your name :");
		String name = sc.nextLine();
		System.out.println("Enter Mobile Number :");
		long mobile = sc.nextLong();
		System.out.println("Enter Mail ID :");
		String mail = sc.next();
		System.out.println("Enter the User Name : ");
		String uname = sc.next();
		System.out.println("Enter the password");
		int psw = sc.nextInt();
		// Login
		System.out.println("Do you want to login...");
		System.out.println("Press 1 for login");
		System.out.println("Press 2 for Exit");
		int key = sc.nextInt();

		if (key ==1)
		{
			System.out.println("Enter the user name ");
			String user_name = sc.next();
			System.out.println("Enter Password");
			int user_pass = sc.nextInt();
			if (uname.equals(user_name) && psw == user_pass)
			{
				System.out.println("Login Sucessfull");
				System.out.println("Welcome "+ name);
				System.out.println("---Select the Models---");
				String model = sc.next();
				switch (model)
				{
				case "Classic350": {
				System.out.println("colors : black/red/white/silver");
				System.out.println("cc : 350");
				System.out.println("cost : 2.25 lcs");
				System.out.println("Thank you for showing your interest...");
				break;
				}
				case "Himalaya" : {
				System.out.println("colors : black/red/white/silver/green");
				System.out.println("cc : 410");
				System.out.println("cost : 3.5 lcs");
				System.out.println("Thank you for showing your interest...");
				break;
				}
				case "Thunderbird" : {
				System.out.println("colors : black/red/white/silver/yellow");
				System.out.println("cc : 410");
				System.out.println("cost : 2.25 lcs");
				System.out.println("Thank you for showing your interest...");
				break;
				}
				default : System.out.println("Sorry "+ model + "is not available");
			}

		}else System.out.println("--Invalid User Name--");
	}else System.out.println("Thank you for login...good bye");
}
}