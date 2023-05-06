class ReverseString {
  
  // solution to leetcode problem https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/879/
    public void reverseString(char[] s) {
        
        
        for(int i=0; i< s.length/2; i++){
            char temp = s[i];
            s[i] = s[s.length - i -1];
            s[s.length - i -1] = temp;
        }
    }
}
