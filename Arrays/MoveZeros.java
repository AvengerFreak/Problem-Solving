package Arrays;
class MoveZeros {
  
  // solution to leetcode problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/
    public void moveZeroes(int[] nums) {
        
        
        int N = nums.length;
        int solution[] = new int[N];
        int k = 0;
        for(int i = 0; i<N; i++){
            
            if(nums[i] != 0){
                solution[k] = nums[i];
                k++;
            }
        }
        
        for(; k < N; k++){
            solution[k]=0;
        }
        
        for(int i =0; i < N; i++){
            nums[i] = solution[i];
        }
    }
}
