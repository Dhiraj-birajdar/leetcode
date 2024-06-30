class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length==1) return false;
        
        HashMap<Integer, Integer> mp=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(mp.containsKey(nums[i])){
                if(Math.abs(i-mp.get(nums[i])) <= k) return true;
            }
            mp.put(nums[i], i);
        }
        return false;
    }
}