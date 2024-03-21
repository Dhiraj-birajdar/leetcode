class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 1;
       for(int i = 1; i<nums.length;i++) {
    	   if(nums[i] != nums[i-1]) {
    		   nums[j] = nums[i];
    		   j++;
    	   }
       }
       return j;

        // Set <Integer> s = new LinkedHashSet();
    	// for(int e: nums)
    	// 	s.add(e);
    	// int i = 0;
    	// for(Integer e: s)
    	// 	nums[i++] = e;
    	// return s.size();
    }
}