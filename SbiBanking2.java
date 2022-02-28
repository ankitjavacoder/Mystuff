import java.util.Scanner;
class SbiBanking2 
{
	public static void main(String[] args) 
	{
		int atmcardpinmain = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("====Welcome to SBI ATM  ====");
		System.out.println("Let's create your Profile");
		System.out.println("May I know your Name please : ");
		String name = sc.nextLine();
		System.out.println("Please enter user name");
		String user_name = sc.next();
		System.out.println("Please Enter your mobile number");
		long mobile = sc.nextLong();
		System.out.println("Enter the type of Account you would to create Savings or Current");
		String acctype = sc.next();
		if (!(acctype.equals("Savings") || acctype.equals("Currents")))
		{
			while (!(acctype.equals("Savings") || acctype.equals("Current")))
			{
				System.out.println("Invalid Account type,enter again");
				String acctype_temp = sc.next();
				acctype = acctype_temp;
			}
		}
		System.out.println("Enter the Amount to Deposit");
		int amount = sc.nextInt();
		if (amount <=0)
		{
			while (amount <=0)
			{
				System.out.println("You can't enter negative values,try again");
				int amount_temp = sc.nextInt();
				amount = amount_temp;	
			}
		}
		System.out.println("Sum of Rs.+-- "+amount+ " Depsosited Sucessfully");
		System.out.println("Enter password");
		String psw= sc.next();
		System.out.println("Please Enter your ATM PIN(enter  4 digits) ");
		int atmpin = sc.nextInt();	
		 if (!(atmpin>999 && atmpin<=9999))
		 {
			 while (!(atmpin>999 && atmpin<=9999))
			 {
				 System.out.println("Invalid Input");
				 int atmpintemp = sc.nextInt();
				 atmpin = atmpintemp;
			 }
		 } 
			 System.out.println("PIN Generated " );
			 System.out.println("Press 1 for Cardless withdrawl and 2 for Card Withdrawl and 3 for Exit");
			int option = sc.nextInt();
				//int count = 0;
				 if (!(option >0 && option <4))
				 {
					while (!(option >0 && option <4))
						{
							System.out.println("Invalid Input");
							int optiontemp = sc.nextInt();
							option = optiontemp;
						}
				 }
				 if (option ==1)
					{
						 System.out.println("You have selected Cardless Widthdrawl");
						System.out.println("Enter Mobile Number");
						long user_input = sc.nextLong();
						System.out.println("Enter password");
						String psw_input = sc.next();
						if (!(user_name.equals(user_input) && psw.equals(psw_input)))
							{
								while (!(mobile==user_input && psw.equals(psw_input)))
								{	
									int count = 0;
									System.out.println("Incorrect details entered try again");
									System.out.println("Enter Mobile Number");
									long user_input_temp = sc.nextLong();
									System.out.println("Enter password");
									String psw_input_temp = sc.next();
									user_input = user_input_temp;
									psw_input = psw_input_temp;	
									
								}
							}
						System.out.println("Login success");
					System.out.println("Type the service you want to choose : ");
					System.out.println(" Press 1 for Balance Enquiry");
					System.out.println("Press 2 for Withdrawl");
					System.out.println("Press 3 for Deposit");
					System.out.println("Press 4 for Pin Change");
					System.out.println("Press 5 for Block Card");
					int service_input = sc.nextInt();
					System.out.println(service_input);
					if (!(service_input == 1 || service_input == 2 || service_input == 3 || service_input == 4 || service_input == 5  ))
					{
						while (!(service_input == 1 || service_input == 2 || service_input == 3 || service_input == 4 || service_input == 5  ))
						{
							System.out.println("Wrong option selected, Try again...");
							int service_input_temp = sc.nextInt();
							service_input = service_input_temp;
						}
					}
		
					if (service_input == 1)
					{
						System.out.println("You have selected Balance Enquiry"); 
						System.out.println("Rs. "+amount+"/-");
					}
					else if (service_input == 2)
					{
						System.out.println("You have selected Money Withdrawl"); 
						System.out.println("A/C Balance : "+amount+"/-"); 
						System.out.println("Enter the amount to be withdrawl"); 
						int amount_withdraw = sc.nextInt();
						if (amount_withdraw >amount )
						{
							while (amount_withdraw >amount)
							{
								System.out.println("Insufficient Funds");
								int amount_withdraw_temp = sc.nextInt();
								amount_withdraw = amount_withdraw_temp;
							}
						}
						amount = amount - amount_withdraw; 
						System.out.println("money debited sucessfully, Remaining Balance : Rs. "+amount+"/-" );
						System.out.println("Thank you for using SBI ATM Service");
					}
					else if (service_input == 3)
					{
						System.out.println("You have selected Deposit of Cash");
						System.out.println("Enter the Amount to deposit");
						int deposit_amount = sc.nextInt();
						if (deposit_amount <=0)
						{
							while (deposit_amount <=0)
							{
								System.out.println("Entered Invalid input");
								System.out.println("Enter the Amount again : ");
								int deposit_amount_temp = sc.nextInt();
								deposit_amount = deposit_amount_temp;
							}
						}
						amount+=deposit_amount;
						System.out.println("Money Deposited Sucessfully. Final Balance is "+amount);
						System.out.println("Thank you for choosing SBI ATM");
					}
					else if (service_input == 4)
					{
						System.out.println("You have selected pin change");
						System.out.println("To confirm your identify, please enter your password ");
						String identity_psw = sc.next();
						if (identity_psw.equals(psw))
						{
							System.out.println("User verified Successfully");
							System.out.println("Enter the New ATM PIN");
							int atm_new_pin = sc.nextInt();
							System.out.println("Enter the New ATM PIN again");
							int atm_new_pin_confirm = sc.nextInt();
							if ((atm_new_pin != atm_new_pin_confirm))
							{
								{
									System.out.println("ATM PIN does not match,Enter PIN again");
									int atm_new_pin_temp = sc.nextInt();
									System.out.println("Enter PIN again to confirm");
									int atm_new_pin_confirm_temp = sc.nextInt();
									atm_new_pin_temp = atm_new_pin;
									atm_new_pin_confirm_temp = atm_new_pin_confirm;
								}
							}
									atmpin = atm_new_pin;
									System.out.println("ATM PIN Changed Sucessfully");

						}
					}
					else if (service_input == 5)
					{
						System.out.println("You have choosen to block your ATM Card");
						System.out.println("Type 'CONFIRM'");
						String confirm = sc.next();
						if (!(confirm.equals("CONFIRM")))
						{
							System.out.println("Account Blocked");
							user_name = "Blocked";
						}
					
					}	
					
					}
					
				 else if (option == 2)
		{
					 {
					 System.out.println("You have selected withdrawl with card");
					 System.out.println("Card Inserted, please type ATM pin");
					 int atmcardpin = sc.nextInt();
					 if (!(atmpin == atmcardpin)) 
					{
						while (!(atmpin == atmcardpin))
						{
							System.out.println("Wrong pin entered,Please enter the ATM Pin");
							int atmcardpin_temp = sc.nextInt();
							atmcardpin = atmcardpin_temp;
							 atmcardpinmain = atmcardpin;
						}
					}
				 }
				{
				 	System.out.println("Login success");
					System.out.println("Type the service you want to choose : ");
					System.out.println(" Press 1 for Balance Enquiry");
					System.out.println("Press 2 for Withdrawl");
					System.out.println("Press 3 for Deposit");
					System.out.println("Press 4 for Pin Change");
					System.out.println("Press 5 for Block Card");
					int service_input = sc.nextInt();
					System.out.println(service_input);
					if (!(service_input == 1 || service_input == 2 || service_input == 3 || service_input == 4 || service_input == 5  ))
					{
						while (!(service_input == 1 || service_input == 2 || service_input == 3 || service_input == 4 || service_input == 5  ))
						{
							System.out.println("Wrong option selected, Try again...");
							int service_input_temp = sc.nextInt();
							service_input = service_input_temp;
						}
					}
		
					if (service_input == 1)
					{
						System.out.println("You have selected Balance Enquiry"); 
						System.out.println("Rs. "+amount+"/-");
					}
					else if (service_input == 2)
					{
						System.out.println("You have selected Money Withdrawl"); 
						System.out.println("A/C Balance : "+amount+"/-"); 
						System.out.println("Enter the amount to be withdrawl"); 
						int amount_withdraw = sc.nextInt();
						if (amount_withdraw >amount )
						{
							while (amount_withdraw >amount)
							{
								System.out.println("Insufficient Funds");
								int amount_withdraw_temp = sc.nextInt();
								amount_withdraw = amount_withdraw_temp;
							}
						}
						amount = amount - amount_withdraw; 
						System.out.println("money debited sucessfully, Remaining Balance : Rs. "+amount+"/-" );
						System.out.println("Thank you for using SBI ATM Service");
					}
					else if (service_input == 3)
					{
						System.out.println("You have selected Deposit of Cash");
						System.out.println("Enter the Amount to deposit");
						int deposit_amount = sc.nextInt();
						if (deposit_amount <=0)
						{
							while (deposit_amount <=0)
							{
								System.out.println("Entered Invalid input");
								System.out.println("Enter the Amount again : ");
								int deposit_amount_temp = sc.nextInt();
								deposit_amount = deposit_amount_temp;
							}
						}
						amount+=deposit_amount;
						System.out.println("Money Deposited Sucessfully. Final Balance is "+amount);
						System.out.println("Thank you for choosing SBI ATM");
					}
					else if (service_input == 4)
					{
						System.out.println("You have selected pin change");
						System.out.println("To confirm your identify, please enter your password ");
						String identity_psw = sc.next();
						if (identity_psw.equals(psw))
						{
							System.out.println("User verified Successfully");
							System.out.println("Enter the New ATM PIN");
							int atm_new_pin = sc.nextInt();
							System.out.println("Enter the New ATM PIN again");
							int atm_new_pin_confirm = sc.nextInt();
							if ((atm_new_pin != atm_new_pin_confirm))
							{
								{
									System.out.println("ATM PIN does not match,Enter PIN again");
									int atm_new_pin_temp = sc.nextInt();
									System.out.println("Enter PIN again to confirm");
									int atm_new_pin_confirm_temp = sc.nextInt();
									atm_new_pin_temp = atm_new_pin;
									atm_new_pin_confirm_temp = atm_new_pin_confirm;
								}
							}
									atmpin = atm_new_pin;
									System.out.println("ATM PIN Changed Sucessfully");

						}
					}
					else if (service_input == 5)
					{
						System.out.println("You have choosen to block your ATM Card");
						System.out.println("Type 'CONFIRM'");
						String confirm = sc.next();
						if (!(confirm.equals("CONFIRM")))
						{
							System.out.println("Account Blocked");
							user_name = "Blocked";
						}
						
					}
			
		}
		}
	}
}