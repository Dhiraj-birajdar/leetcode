class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int c = 0;
        for(int e: hours)
            if(e>=target) c++;
        return c;
    }
}