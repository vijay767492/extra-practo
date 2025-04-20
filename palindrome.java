public class palindrome {
   public static String[] link(String s ){
    
    String [] sub=new String[(s.length()*(s.length()+1))/2];
    int k=0;
for(int i=0;i<s.length();i++){
 for (int j = i; j < s.length(); j++)  
{ sub[k] = s.substring(i, j+1);
    k++;}
 }
return  sub;
   }
   
    public static void main(String[] args) {
      String[] result= link("vijay");
for (int i=0;i<result.length;i++){
System.out.println(result[i]);
}
     }
}
