import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.RandomAccess;
import java.util.Vector;

public class colection_practo {
    public int vijay(){
       int a=10;
       int b=70;
       return (a);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(89);
        list.add(757493);
        list.add(0,7);
   System.out.println("this are arraylist values :"+list);

  

 Vector ff=new Vector();
ff.add(12);
ff.add(3); 
ff.add("vijay");
ff.add("vijay1");
ff.add("vijay2");

System.out.println("these are the vector values or object :"+ff);
for (int i=0;i<list.size();i++){ ff.add(list.get(i));}

System.out.println("after adding the object valus of the arraylist into vectors :"+ff);
ff.remove(3); 
System.out.println("after removing vijay1 :"+ff);

System.out.println(ff.contains("vijay"));

Integer [] dd={9,23,5,7,23,5,6};
//converting the array into the vector
Vector<Integer> v3 =new Vector<>(Arrays.asList(dd));
System.out.println(v3);
System.out.println(v3.get(1));



    } 
}







