public class PlaindromNum2 {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int rev=0;
        int original=x;
        while(x!=0){
        int digit=x%10;
        rev=rev*10+digit;
        x=x/10;
      } return rev==original;
      }
  public static void main(String[] args) {
    System.out.println(isPalindrome(-245542));
  }
  }