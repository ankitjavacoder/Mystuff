package TreeMap;

import java.util.Comparator;
import java.util.*;
public class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of Value to be sorted");
        System.out.println("EmployeeNo, Age, Salary");
        String input = sc.next();
if (input.equalsIgnoreCase("emp")) {
    TreeMap<MyMembers, Integer> empTreeMap = new TreeMap<>(new EmpComparator());
    empTreeMap.put(new MyMembers(101,25660,26,"Hyderabad"),1);
    empTreeMap.put(new MyMembers(99,256600,39,"Chennai"),3);
    empTreeMap.put(new MyMembers(156,96500,58,"France"),2);
    System.out.println("Employee in Accending Order");
    for (Map.Entry entry : empTreeMap.entrySet() ){
        System.out.println(entry.getKey());
    }
} else if (input.equalsIgnoreCase("age")) {
    TreeMap<MyMembers, Integer> empTreeMap = new TreeMap<>(new AgeComparator());
    empTreeMap.put(new MyMembers(101,25660,26,"Hyderabad"),1);
    empTreeMap.put(new MyMembers(99,256600,39,"Chennai"),3);
    empTreeMap.put(new MyMembers(156,96500,58,"France"),2);
    System.out.println("Employee in Accending Order");
    for (Map.Entry entry : empTreeMap.entrySet() ){
        System.out.println(entry.getKey());
    }
}
else if (input.equalsIgnoreCase("salary")) {
    TreeMap<MyMembers, Integer> empTreeMap = new TreeMap<>(new AgeComparator());
    empTreeMap.put(new MyMembers(101,25660,26,"Hyderabad"),1);
    empTreeMap.put(new MyMembers(99,256600,39,"Chennai"),3);
    empTreeMap.put(new MyMembers(156,96500,58,"France"),2);
    System.out.println("Employee in Accending Order");
    for (Map.Entry entry : empTreeMap.entrySet() ){
        System.out.println(entry.getKey());
    }
}
    }
}
class EmpComparator implements Comparator<MyMembers>{
    @Override
    public int compare(MyMembers o1, MyMembers o2) {
        return o1.getEmpNo()-o2.getEmpNo();
    }
}
class AgeComparator implements Comparator<MyMembers>{
    @Override
    public int compare(MyMembers o1, MyMembers o2) {
        return o1.getEmpNo()-o2.getEmpNo();
    }
}
class SalComparator implements Comparator<MyMembers>{
    @Override
    public int compare(MyMembers o1, MyMembers o2) {
        return o1.getSalary()-o2.getSalary();
    }
}