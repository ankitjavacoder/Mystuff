package access_specifier.demopack4;

public class Calender {
	private int monthNumber;
	public void provideMonthNumber(int monthNumber) {
		if (monthNumber >= 1 && monthNumber <=12) {
			this.monthNumber  = monthNumber;
			System.out.println("Given month number is valid");
			System.out.println("month number assigned successfully");
		}
		else {
			System.out.println("Invalid month name");
		}
	}
}
