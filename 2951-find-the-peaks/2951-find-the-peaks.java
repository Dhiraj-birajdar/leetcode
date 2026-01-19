class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans = new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i-1]<mountain[i] && mountain[i]>mountain[i+1]) ans.add(i);
        }
        return ans;
    }
}

// Intuition
// A “peak” is an element that is greater than both its neighbors.
// We need to return the indices of all such elements in the array.

// Approach
// Create an empty list to store peak indices.
// Traverse the array from index 1 to n - 2 (since the first and last elements can’t be peaks).
// For each element, check if it’s greater than both its neighbors:
// If m[i - 1] < m[i] && m[i] > m[i + 1], add i to the list.
// Return the list of peak indices.
// Complexity
// Time complexity: O(n)
// Space complexity: O(1) (excluding the output list)