package map;
import java.util.*;
public class HashMap1 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "wednesday");
		hm.put(12, "monday");
		hm.put(15, "sunday");
		hm.put(20, "sunday");
		hm.put(12, "tuesday");
		System.out.println(hm);
		System.out.println("searching of key "+ hm.containsKey(10));
		System.out.println("searching of value : "+ hm.containsValue("sunday"));
		System.out.println("getting value :"+ hm.get(10));
		System.out.println("after removing : "+ hm.remove(12));
		System.out.println("after deletion " + hm);
	}

}
