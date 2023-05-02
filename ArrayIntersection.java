class ArrayIntersection {
  
  // solution to leetcode problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
    public int[] intersect(int[] nums1, int[] nums2) {
        
        // for duplicate entries sort to later just keep pairs
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        ArrayList<Integer> result = new ArrayList<>();
        
        int i =0 ;
        int j =0;
        
        while(i< nums1.length && j<nums2.length){
        if (nums1[i]>nums2[j]){
            j++;

        }else if (nums1[i]<nums2[j]){
            i++;

        }else {
            result.add(nums1[i]);
                i++;
                j++;
            }
        }
        
        return result.stream().mapToInt(x -> x).toArray();
    }
}
