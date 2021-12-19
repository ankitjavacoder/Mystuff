class Increment2 
{
	public static void main(String[] args) 
	{
		int x =6;
		int y = 9;
		x=y;
		x--;
		y++;
		x=x+y;
		y=x-y;
		y--;
		System.out.println(y++);
		System.out.println(++x);
		x++;
		y--;
		System.out.println(x);
		System.out.println(y);
	}
}
