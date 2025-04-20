public class Aoit {
    public int myAtoi(String s) {
        int i=0; int n=s.length();
        int result=0;
        int sign=1;
        while(i<n && s.charAt(i)==' '){
i++;
        }
        if(i<n && s.charAt(i)=='-'|| i<n && s.charAt(i)=='+'){
         sign=(s.charAt(i)=='-')?-1:1;
         i++;
        }

        
        // 3. Read digits and build the number
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            // 4. Check for overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * result);
    }
      public static void main(String[] args) {
        Aoit vv=new Aoit();
       System.out.println(vv.myAtoi("+5 89")); 
      }
}