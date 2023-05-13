package Arrays;
// Solution for problem https://leetcode.com/explore/featured/card/top-interview-questions-easy/92/array/727/

class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        
       int n = nums.length;
       // Return, if array is empty or
        // contains a single element
        if (n == 0 || n == 1)
            return n;
 
        int[] temp = new int[n];
 
        // Start traversing elements
        int j = 0;
        for (int i = 0; i < n - 1; i++)
             
            // If current element is not equal to next
            // element then store that current element
            if (nums[i] != nums[i + 1])
                temp[j++] = nums[i];
 
        // Store the last element as whether it is unique or
        // repeated, it hasn't stored previously
        temp[j++] = nums[n - 1];
 
        // Modify original array
        for (int i = 0; i < j; i++)
            nums[i] = temp[i];
 
        return j;
    }
}
