package arraysStandardPrograms;

public class Program1 {

	public static void main(String[] args) {
		String s = "welcome to java";
		System.out.println("before splitting : "+s);
		System.out.print("After splitting : ");
		String[] s1 = s.split(" ");
		for(String s2 : s1) {
			System.out.print(s2);
		}
	}

}
