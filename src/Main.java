import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<LiveCodeMember> liveCodeMemberList = initObjectList();
        //Sort ArrayList based on object field
        System.out.println("== Sort by id field ==");
        Comparator<LiveCodeMember> idComparator = new Comparator<LiveCodeMember>() {
            @Override
            public int compare(LiveCodeMember o1, LiveCodeMember o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else {
                    return 0;
                }

            }
        };
        liveCodeMemberList.sort(idComparator);
        System.out.println(liveCodeMemberList);
        System.out.println("");
        System.out.println("== Sort by age field ==");

    }
    //Init LiveCodeMember List
    public static List<LiveCodeMember> initObjectList() {
        List<LiveCodeMember> list = new ArrayList<>();
        list.add(new LiveCodeMember(1, "Live Code Member 1", 20));
        list.add(new LiveCodeMember(3, "Live Code Member 3", 23));
        list.add(new LiveCodeMember(2, "Live Code Member 2", 18));
        System.out.println("== Original ==");
        System.out.println(list);
        System.out.println("");
        return list;
    }
}