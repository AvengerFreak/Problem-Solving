package Arrays;

import java.util.Arrays;

class ContainsDuplicate {
  
  // solution to leetcode problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
  
    public boolean containsDuplicate(int[] nums) {
        
        Arrays.sort(nums);

        for(int i = 0; i < nums.length -1; i++){

            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        
        return false;
    }
}
