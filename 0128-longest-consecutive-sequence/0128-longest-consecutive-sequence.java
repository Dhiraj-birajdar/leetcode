import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        // Arrays.stream(nums).boxed().collect(Collectors.toSet());
        for (int i : nums)set.add(i);
        int result = 0;
        for (Integer i : set) {
            if (!set.contains(i - 1)) {
                int tmp = 1;
                while (set.contains(++i))tmp++;
                result = Math.max(tmp, result);
            }
        }
        return result;
    }
}