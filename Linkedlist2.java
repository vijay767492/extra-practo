import java.util.LinkedList;

public class Linkedlist2 {
    public static void main(String[] args) {
        LinkedList<Integer> dd=new LinkedList<>();
        dd.add(13);
        dd.add(33);
        dd.add(33);
        dd.add(12345);
        dd.add(0145);
        dd.add(1313);
        dd.add(1313);
        dd.add(2);
        dd.add(33);
        dd.add(1313);
    // dd.remove();
    
    System.out.println(dd);
    System.out.println(dd.contains(33));
    System.out.println( dd.indexOf(33));
   if(dd.contains(33)) {
       {
        while (dd.contains(33)) {
            dd.remove((Integer)1313);
        }
    
       }
    }
    System.out.println(dd);
    }
}
