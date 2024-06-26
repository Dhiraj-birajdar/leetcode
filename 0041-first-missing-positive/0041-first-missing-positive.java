class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> s = new HashSet<Integer>(Arrays.asList(Arrays.stream(nums).boxed().toArray(Integer[]::new)));
        int i = 1;
        while (s.contains(i))
            i++;
        return i;
    }
}