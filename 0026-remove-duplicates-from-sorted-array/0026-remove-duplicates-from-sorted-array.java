class Solution {
    public int removeDuplicates(int[] nums) {
        Set <Integer> s = new LinkedHashSet();
    	for(int e: nums)
    		s.add(e);
    	int i = 0;
    	for(Integer e: s)
    		nums[i++] = e;
    	return s.size();
    }
}