package String;
class IsPalindrome {
  
  // solution to leetcode problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/883/
    public boolean isPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder(s.replaceAll("[^A-Za-z0-9]", "").toLowerCase());
        return sb.toString().equals(sb.reverse().toString());
    }
}
