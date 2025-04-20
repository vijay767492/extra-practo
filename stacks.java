import java.util.Iterator;
import java.util.Stack;


public class stacks {
    public static void main(String[] args) {
        Stack<Integer> nn=new Stack<>();
        nn.add(3);
        nn.add(3);
        nn.add(4);
        nn.add(2);
        nn.add(4);
        nn.add(3);
        nn.add(9);
        Iterator<Integer> tt=nn.iterator();
        while(tt.hasNext()){
            int value =tt.next();
            if(value==3||value ==4){
                tt.remove();
            }
        }
        System.out.println(nn);
    }
}
