class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        int sum=0,cap=0,c=0;
        for(int i:apple) sum+=i;
        Arrays.sort(capacity);
        for(int i= capacity.length-1;i>=0;i--){
            if((cap+=capacity[i])>=sum){
                return ++c;
            }
            c++;
        }
        return c;
    }
}