class ADS 
{
	public static void main(String[] args) 
	{
		 char ch = 'A';
		if( (ch>='A'&& ch<='Z') ||(ch>='a'&& ch<='z'))
		{
			System.out.println("Alphabet");
		}
		else if (ch>='0' && ch<='9')
		{
			System.out.println("Digit");
		}
		else {
		System.out.println("its Special Character");
		}
	}
}
