import java.util.*;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<String> tt =new LinkedList<>();
        LinkedList<Integer> ll =new LinkedList<>();
        ll.add(12);

        tt.add("v");
        ll.add(15);
        tt.add("vi");
        tt.add("vij");
        ll.add(22);
        tt.add("vija");
        tt.add("vijay");
        tt.addFirst("Bikshapthi");
        ll.add(12);
        ll.add(12);
        ll.add(12);
       
        ll.remove((Integer)22);
        while(ll.contains(12)){
            ll.remove((Integer)12);
        }
        System.out.println(tt.size());
        System.out.println(tt); 
        System.out.println(ll); 

    }
}
