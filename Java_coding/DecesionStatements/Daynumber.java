class  Daynumber
{
	public static void main(String[] args) 
	{
		String day = "Sunday";
		switch(day){
			case "Sunday" : System.out.println( day + "is at day 1");break;
			case "Monday" : System.out.println(day + "is at day 2");break;
			case "Tuesday" : System.out.println(day + "is at day 3");break;
			case "Wednesday" : System.out.println(day + "is at day 4");break;
			case "Thursday" : System.out.println(day + "is at day 5");break;
			case "Friday" : System.out.println(day + "is at day 6");break;
			case "Saturday" : System.out.println(day + "is at day 7");break;
			default : System.out.println("Invalid Day");

		}
	}
}
