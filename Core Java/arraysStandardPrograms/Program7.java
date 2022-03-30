package arraysStandardPrograms;

public class Program7 {

	public static void main(String[] args) {
		int check = 300;
		int count = 0;
		int x[] = {10,40,30,20};
		for(int i = 0;i<x.length;i++) {
			if (check == x[i]) {
				count++;
				break;
			}
		}
			if (count >0) {
				System.out.println("element founded");
			} else {
				System.out.println("not founded");
			}
		
	}

}
