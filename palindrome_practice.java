public class palindrome_practice {
    public String LongestPalindrome(String str ){

        if(str.length()<=1){
            return str;
        }
        String LPS= str.substring(0, 1);
        for(int i=1;i<str.length();i++){
            int low=i;
            int high=i;
            while(str.charAt(low)==str.charAt(high)){
                low--;
                high++;
                if(low==-1||high==str.length()){
                    break;
                }
                String palindrome=str.substring(low,high+1);
                if(palindrome.length()>LPS.length()){
                    LPS=palindrome;
                }
            }
            low=i-1;
            high=i;
            while(str.charAt(low)==str.charAt(high)){
                low--;
                high++;
                if(low==-1||high==str.length()){
                    break;
                }
                String palindrome=str.substring(low,high+1);
                if(palindrome.length()>LPS.length()){
                    LPS=palindrome;
                }
            }

        }
        return LPS;
    }
    public static void main(String[] args) {
        palindrome_practice ff=new palindrome_practice();
        String vv="ac";
        System.out.println(ff.LongestPalindrome(vv));
    }
}
