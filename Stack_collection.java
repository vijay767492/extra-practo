
import java.util.*;

public class Stack_collection {
    public static void main(String[] args) {
        Stack<Integer> books =new Stack<>();
        ArrayList<String> books2 =new ArrayList<>();
        Vector<String> books3=new Vector<>();
        books.add(9);
        books.add(10);
        books.add(12);
        books.add(11);
books2.add("vijay1");
books2.add("vijay2");
books2.add("vijay3");

  System.out.println(books2.get(2)+" ____this is to seperate the objects_____ "+books.get(1));
     System.out.println("stacks ..."+books);
     System.out.println("arraylist ..."+books2);
    for(int i=0;i<books2.size();i++){
        books3.add(books2.get(i));
    }
   
    
    System.out.println("vectors..."+books3);

books2.remove(0);
System.out.println("vectors..."+books2);
//updating the list 
books3.set(2,"bik");
System.out.println("after setting "+books3);


         }
}
