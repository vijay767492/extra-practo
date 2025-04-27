import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static boolean isvalid(String a){
        Stack<Character> ss=new Stack<>();
        HashMap<Character,Character> hh=new HashMap<>();
        hh.put('}', '{');
        hh.put(')', '(');
        hh.put(']', '[');
     
        for(int i=0;i<a.length();i++){
           
            char cc= a.charAt(i);
            if(cc=='{'||cc=='['||cc=='('){
                ss.push(cc);
            }
            else if (ss.isEmpty()|| ss.pop()!=hh.get(cc)) {
                return false;
            }
            
      
        }
       
        return ss.isEmpty();
    }
    public static void main(String[] args) {
        String vv="({}";
        System.out.println(isvalid(vv));
    }
}
