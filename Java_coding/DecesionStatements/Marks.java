class Marks 
{
	public static void main(String[] args) 
	{
		int score = 80;
		if (score >= 90 && score <100)
		{
			System.out.println("Outstanding");
		}
		else if (score >=80 && score <90)
		{
			System.out.println("Excellent");
		}
		else if (score >=70 && score <80)
		{
			System.out.println("Very Good");
		}
		else if (score >=60 && score <70)
		{
			System.out.println("Average");
		}
else if (score >=50 && score <60)
		{
			System.out.println("Pass");
		}
		else if (score >=0 && score <35)
		{
			System.out.println("Legends");
		}
		else{
			System.out.println("Invalid Marks");
		}

	}
}
