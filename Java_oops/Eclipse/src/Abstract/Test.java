package Abstract;

import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 1;i<=2;i++) {			
		try {
			long x = sc.nextLong();
			System.out.println(x+" is fiited here");
			try {
			byte y = (byte)x;
			if (y == x) {
				System.out.println("* byte");
			}
			}
			catch(Exception e) {}
			try {
				short y = (short) x;
				if (y == x) {
					System.out.println("* short");
				}
			}
			catch(Exception e) {}
			try {
				int y = (int)x;
				if (y == x) {
					System.out.println("* int");
				}
			}
			catch(Exception e) {}
				System.out.println("* long");
		}
		catch(Exception e ){
			System.out.println(sc.next()+" is not fitted here");
		}
		}
	}

}