import java.util.stream.*;
class Solution {
    public int maxDistinct(String s) {
        //approach 1
        // return Arrays.stream(s.split("")).collect(Collectors.toSet()).size();
        //approach 2
        // Set<Character> set = new HashSet<>();
        // for(char c:s.toCharArray()) set.add(c);
        // return set.size();
        //approach 3
        boolean[] arr = new boolean[26];
        int count=0;
        for(char c:s.toCharArray()){
            if(!arr[c-'a']){
                count++;
                arr[c-'a']=true;
            } 
        }
        return count;
    }
}
// Intuition
// We can only start one substring for each unique character. So the maximum possible substrings is just the number of distinct characters in the string.

// Approach
// Use Set to find how many unique letters are there.
// That count is the answer, because we can always split the string so that each unique character starts exactly one substring.
// Complexity
// Time Complexity: O(n)
// Space Complexity: O(1)