// Solution for problem https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        
       int size = nums.length;
        
        if(size == 0 || size == 1 ){
            return size;
        }
        
        int j = 0;
        int temp[] = new int[size - 1];
        for(int i = 0; i< size - 1; i++){
            
            if(nums[i] != nums[i+1]){
                temp[j++] = nums[i];
            }
            
        }
        
        temp[j++] = nums[size - 1];
        
        for(int i=0; i< j; i++ ){
            nums[i] = temp[i];
        }
        
        return j;
    }
}
