class MarksGrade 
{
	public static void main(String[] args) 
	{
		int score = 91;
		if (score >= 90 && score <100)
		{
			System.out.println("O");
		}
		else if (score >=80 && score <90)
		{
			System.out.println("A+");
		}
		else if (score >=70 && score <80)
		{
			System.out.println("A");
		}
		else if (score >=60 && score <70)
		{
			System.out.println("B+");
		}
else if (score >=50 && score <60)
		{
			System.out.println("C");
		}
		else if (score >=0 && score <35)
		{
			System.out.println("F");
		}
		else{
			System.out.println("Invalid Marks");
		}

	}
}
