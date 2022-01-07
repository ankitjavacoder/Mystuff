class  Timepractice
{
	public static void main(String[] args) 
	{
		int hours = 22,hour;
		int temp = hours;
		if (temp>12)
		{
			hour = temp-12;
			System.out.println("its "+hour +" o clock P.M."); 
		}
		else {
			hour = temp;
		System.out.println("its "+ hour + " o clock A.M.");
		}
		if (hours >= 0 && hours <4)
		{
			System.out.println("Good Night");
		}
		else if (hours >=4 && hours < 12)
		{
			System.out.println("Good Morning");
		}
		else if (hours >=12 && hours < 16)
		{
			System.out.println("Good Afternoon");
		}
		else if (hours >=16  && hours <20)
		{
			System.out.println("Good Evening");
		}
		else if (hours >=20 && hours <24)
		{
			System.out.println("Good Night");

		}
	}
}
