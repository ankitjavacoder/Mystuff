class  Weekendornot
{
	public static void main(String[] args) 
	{
		String day = "Friday";
		switch(day){
			case "Sunday" : System.out.println( day + " is weekend");break;
			case "Monday" : System.out.println(day + " is weekday");break;
			case "Tuesday" : System.out.println(day + " is weekday");break;
			case "Wednesday" : System.out.println(day + " is weekday");break;
			case "Thursday" : System.out.println(day + " is weekday");break;
			case "Friday" : System.out.println(day + " is weekday");break;
			case "Saturday" : System.out.println(day + " is weekend");break;
			default : System.out.println("Invalid Day");

		}
	}
}
