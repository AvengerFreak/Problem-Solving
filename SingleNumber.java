// solution to leetcode problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

class SingleNumber {
  
public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            
            if(!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            
            else {
                map.remove(nums[i]);
            }
                
        }
        
        return map.keySet().toArray(new Integer[0])[0].intValue();
            
    }
