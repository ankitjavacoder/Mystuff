import java.util.Random;

public class Program1 {

	public static void main(String[] args) {
		Random random = new Random();
		int guess = 0;
		int secret = random.nextInt(1);
		long count = 1;
		do {
			guess = random.nextInt(1);
			if (guess == secret) {
				break;
			}
			else count++;
		} while (guess != secret);
		System.out.println("Number of wrong done by Java : " + count);
	}

}
