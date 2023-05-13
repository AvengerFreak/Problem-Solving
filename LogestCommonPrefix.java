class LongestCommonPrefix {
  
  // solution to leetcode problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/887/
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
       
       String result = strs[0];
       
       
       for(int i = 1; i < n; i++){
            // indexOf() of substring from string.
            while(strs[i].indexOf(result) != 0){
               
                // reset matched prefix
                result = result.substring(0, result.length()-1);
               
                // check for empty case. direct return if true..
                if(result.isEmpty()){
                    return "";
                }
            }
        }
        
        return result;
    }
}
