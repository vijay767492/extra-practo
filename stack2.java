import java.util.Stack;

public class stack2 {
    public static void main(String[] args) {
        Stack<Integer> mm=new Stack<>();
        mm.add(34);
        mm.add(45);
        mm.add(3);
        mm.add(4);
        mm.add(314);
        mm.add(36);
        mm.push(14);
       mm.pop();
       System.out.println( mm.search(314));
       System.out.println( mm.indexOf(314));
        System.out.println( mm.peek());
    }
}
