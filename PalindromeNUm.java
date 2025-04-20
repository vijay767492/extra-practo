public class PalindromeNUm {
    public static boolean isPalindrome(int x) {
        int digit=0;
        int rev=0;
        int count =0;
        int temp=x;
        int temp2=x;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        
        for(int i=0;i<count;i++){
            
digit=temp2%10;
rev=rev*10+digit;
temp2=temp2/10;

        }
        if(rev==x){
            return true;
        }
        else{ 
            return false;
        }
     
    }
    public static void main(String[] args) {
System.out.println(isPalindrome(123454321));
System.out.println(isPalindrome(1234554321));
    }
}