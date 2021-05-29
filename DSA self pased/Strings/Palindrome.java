public class Palindrome {

    // Palindrome Naive
    // Time Complexity: Theta(n)
    // Space Complexity: Theta(n)
    public static boolean checkPalindrome(String str) {
        StringBuilder rev = new StringBuilder(str);
        rev.reverse();
        return str.equals(rev.toString());
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static boolean isPalindrome(String str) {
        int begin = 0;
        int end = str.length() - 1;
        while (begin < end) {
            if (str.charAt(begin) != str.charAt(end)) {
                return false;
            }
            begin++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "level";
        System.out.println(isPalindrome(str));
    }
}