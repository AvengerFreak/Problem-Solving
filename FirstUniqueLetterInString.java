class firstUniqueLetterInString {
  
  // solution to leetcode problem https://leetcode.com/explore/featured/card/top-interview-questions-easy/127/strings/881/
  public int firstUniqChar(String s) {
        
        LinkedHashMap<Character, Integer> lhm
            = new LinkedHashMap<>(); // hashmap that keeps insertion order
        
        int N = s.length();
        
        for(int i =0; i<N; i++){
            char c = s.charAt(i);
            
            if(!lhm.containsKey(c)){
                lhm.put(c, i);
            }
            
            else{
                lhm.put(c, -1); // is duplicated
            }
        }
        
        Iterator<Map.Entry<Character, Integer>> iter = lhm.entrySet().iterator();
        
        while(iter.hasNext()){
            
            int index = iter.next().getValue().intValue();
            
            if(index != -1){
                return index;
            }
        }
        
        return -1;
    }
}
