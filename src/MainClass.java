import java.util.Vector;

public class MainClass {
    public static void main(String[] args) {
        Vector v = new Vector();
        Vector v1 = new Vector();
        v.add(12);
        v.add(11);
        v.add(45);
        v.add(43);
        v.add(65);
        v.add(65);
        v.add(65);
        v.add(65);
        v.add(65);
        v.add(65);
        v.addElement(100);
        System.out.println(" The Capacity : " + v.capacity());
        System.out.println(v.get(2));
        System.out.println(v);
        v.trimToSize();
        System.out.println(v.capacity());
        v.add(65);
        v.add(65);
        v.add(0023);
        System.out.println(v);
        System.out.println(v.capacity());
    v1 = (Vector) v.clone();
        System.out.println(v1);
    }
}
