class PalindromeFinder {

    // Method 1: Generate all substrings
    public static String[] getAllSubstrings(String str) {
        int n = str.length();
        int count = (n * (n + 1)) / 2; // Total number of substrings
        String[] substrings = new String[count];
        int index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                substrings[index++] = str.substring(i, j + 1);
            }
        }
        return substrings;
    }

    // Method 3: Check if a string is palindrome
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Method 2: Find the longest palindrome from substrings
    public static String getLongestPalindrome(String str) {
        String[] substrings = getAllSubstrings(str);
        String longestPalindrome = "";
        
        for (int i = 0; i < substrings.length; i++) {
            if (isPalindrome(substrings[i]) && substrings[i].length() > longestPalindrome.length()) {
                longestPalindrome = substrings[i];
            }
        }
        
        return longestPalindrome;
    }

    // Main method
    public static void main(String[] args) {
        String str = "vijaybeyajiv";  // Example input
        String longestPalindromee = getLongestPalindrome(str);
        System.out.println("Longest Palindrome: " + longestPalindromee);
        System.out.println("Length: " + longestPalindromee.length());
    }
}
