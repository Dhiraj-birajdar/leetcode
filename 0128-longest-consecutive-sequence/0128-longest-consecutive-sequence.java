import java.util.Arrays;
import java.util.stream.Collectors;
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        int result = 0;
        for(Integer i:set){
            int tmp=0;
            if(!set.contains(i-1)){
                tmp=1;
                while(set.contains(++i))tmp++;
            }
            result = Math.max(tmp,result);
        }
        return result;
    }
}