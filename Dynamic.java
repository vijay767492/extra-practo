
import java.util.HashMap;


public class Dynamic {
    

     public static int febo(int n){
       return febo(n,new HashMap());

     }
     public static int febo(int n,HashMap<Integer,Integer> memo){
        if(n==0||n==1) return n;
 if(memo.containsKey(n)){
    return memo.get(n);
 }

        int result=febo(n-1,memo)+febo(n-2,memo);
memo.put(n,result);
return result;
     }

public static int febe(int n ){
    HashMap<Integer,Integer> memo=new HashMap<>();
    if(n==0||n==1){ return n;}
    if(memo.containsKey(n)){
       return memo.get(n);
    }
   
           int result=febo(n-1)+febo(n-2);
   memo.put(n,result);
   return result;
        }



    
  
public static void main(String[] args) {
   
    System.out.println(febo(6));
    System.out.println(febe(5));

}

}
