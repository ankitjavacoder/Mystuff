class Divisibleby3and7andeven
{
	public static void main(String[] args) 
	{
		int number = 42;
		if(number%3==0 && number%7 == 0){
		System.out.println(number + " is divisible by 3 and 7");
		if (number%2 == 0)
		{
			System.out.println(number + "is even");
		}
		else { 
						System.out.println(number + "is odd");
		}
	}
	else{
		System.out.println(number +" is  not divisible by 3 and 7");
	}
}
}