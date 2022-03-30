package arraysStandardPrograms;

public class Program2 {

	public static void main(String[] args) {
		String s = "welcomes tos javas";
		System.out.println("before splitting : "+s);
		System.out.print("After splitting : ");
		String[] s1 = s.split("s");
		for(String s2 : s1) {
			System.out.print(s2);
		}
	}

}
