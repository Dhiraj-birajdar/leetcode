class Solution {
    public long countOperationsToEmptyArray(int[] nums) {
        int[] indices = IntStream.range(0, nums.length)
                .mapToObj(i -> new int[]{i, nums[i]})
                .sorted(Comparator.comparingInt(a -> a[1]))
                .mapToInt(a -> a[0])
                .toArray();

        return nums.length + IntStream.range(1, indices.length)
                .filter(i -> indices[i - 1] > indices[i])
                .mapToLong(i -> nums.length - i)
                .sum();    
    }
}