import java.util.*;

public class Display {
    public static void main(String[] args) {
        List<MyMembers> memberslist = initObjectList();
        Comparator<MyMembers> idComp = new Comparator<MyMembers>() {
            @Override
            public int compare(MyMembers o3, MyMembers o4) {
            return o3.getEmpId()-o4.getEmpId();
            }
        };
        Comparator<MyMembers> salComp = new Comparator<MyMembers>() {
            @Override
            public int compare(MyMembers o3, MyMembers o4) {

                return o4.getSalary()- o3.getSalary();
            }
        };
    memberslist.sort(idComp);
        System.out.println("By Id");
        System.out.println(memberslist);
memberslist.sort(salComp);
        System.out.println("By Salary");
        System.out.println(memberslist);
    }
    public static List<MyMembers> initObjectList(){
        ArrayList<MyMembers> mylist = new ArrayList<>();
        mylist.add( new MyMembers(101,"Ankit",350000,"Hyderabad"));
        mylist.add( new MyMembers(105,"Sofi",300000,"Hyderabad"));
        mylist.add( new MyMembers(102,"Subbu",250000,"Hyderabad"));
        System.out.println(mylist);
        return mylist;
    }
}