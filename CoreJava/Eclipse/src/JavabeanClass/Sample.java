package JavabeanClass;

public class Sample {
	private static Sample rv = null;
	private Sample() {
		System.out.println("Constructor is generated");
	}
	public static Sample getObject() {
		if (rv == null) {
			rv = new Sample();
		}
		return rv;
	}
}
