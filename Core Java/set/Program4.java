package set;
import java.util.Iterator;
import java.util.TreeSet;

public class Program4 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(20);
		ts.add(50);
		ts.add(20);
		ts.add(50);
		ts.add(70);
		ts.add(12);
		ts.add(52);
		System.out.println(ts);
		Iterator i = ts.iterator();
		System.out.println(i.next());
		System.out.println(i.hasNext());
		System.out.println(i.next());
	}
}
	