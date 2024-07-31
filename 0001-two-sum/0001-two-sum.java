class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i]))
                return new int[]{i,m.get(target-nums[i])};
            m.put(nums[i],i);
        }
        return new int[]{-1,-1};
    }
}