class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int i = 0,c=0;
        List<Integer> li = Arrays.stream(arr).boxed().toList();

        while(c!=k)
            if(!li.contains(++i))
                c++;        
        
        return i;

    }
}