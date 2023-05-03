class TwoSumTarget {
  // solution to leetcode problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/
    public int[] twoSum(int[] nums, int target) {
        
        int N = nums.length;
        int solution[] = new int[2];
        
        if(N == 2){
            solution[0]=0;
            solution[1]=1;
            return solution;
        }

        for (int i = 0; i < N-1; i++)
        {
            for(int j = i + 1; j <N; j++) {
                if (nums[i] + nums[j] == target) {
                    solution[0] = i;
                    solution[1] = j;
                    
                    return solution;
                }
            }
        }
        
        return solution; // [0,0] for case where there is no solution

    }
