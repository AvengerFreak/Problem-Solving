package Arrays;
// solution to leetcode problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/

class RotateArray {
        
public void rotate(int[] nums, int k) {
        
     int n = nums.length;
     int[] copy = new int[n];

    //  rotate the array
    for(int i=0;i<n;i++){
        int new_index = (i+k)%n;
        copy[new_index] = nums[i];
    }
    // Now that the array is copied, copy the elements to the original array. 
    for(int i=0;i<n;i++){
         nums[i]=copy[i];
     }
    }
}
