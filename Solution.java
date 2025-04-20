import java.util.ArrayList;
class Solution {
    public static void main(String[] args) {
        Solution nn=new Solution();
        System.out.println(nn.lengthOfLongestSubstring("abbccajhgcgglxlyrxfglhvlhvdadcuAV;UIUVIUAVUDUbcbb"));
        
    }
    public int lengthOfLongestSubstring(String s) {
    ArrayList<Character> mm=new ArrayList<>();
    int maxLength=0;
    int start=0;
    for(int end=0;end<s.length();end++){
       
        while(mm.contains(s.charAt(end))){
            mm.remove(Character.valueOf(s.charAt(start)));
            start++;
        }
        mm.add(s.charAt(end));
        maxLength =Math.max(mm.size(),maxLength);
    }
     return maxLength; }
}