public class subtracingString {
    public static int Aoit(String s) {
  int i=0;
  int digit=0;
  int n=s.length();
  int num=0;
  int sign=1;
  while(i<n && s.charAt(i)==' '){
    i++;
  }
  if(i<n && (s.charAt(i) == '+' || s.charAt(i) == '-')){
sign=s.charAt(i)=='-'?-1:1;
i++;
  }
 while(i<n && Character.isDigit(s.charAt(i))){
    digit=s.charAt(i)-'0';
  
    if (num > Integer.MAX_VALUE / 10 || 
               (num == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
    num=num*10+digit;
    i++;
 }
    return num*sign; }
    public static void main(String[] args) {
        System.out.println(Aoit("-2147483649A"));
    }

}