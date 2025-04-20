import java.util.*;
public class hashtable1 {

    public static void main(String[] args) {
        Map<Integer,String> mm=new Hashtable<>();
    
mm.put(301, "vijay");
mm.put(31, "vijay12");
mm.put(303, "y");
mm.put(304, "vijay");
mm.put(3, "vijay");
// System.out.println(mm);
Set<Integer> keyss=mm.keySet();
// for(Integer key:keyss){
//     System.out.println(key);}
// System.out.println();
// for(Integer ff:keyss){
//     System.out.println(mm.get(ff));
// }
// mm.remove(3);
// mm.remove(304,"vijay");
 //to know how many elements are there in map
 System.out.println(mm.size());
 //to delete the entire map 
//  mm.clear();
Collection <String> val=mm.values();
for(String gg:val){
    System.out.println(gg);


   
}
    }
}
