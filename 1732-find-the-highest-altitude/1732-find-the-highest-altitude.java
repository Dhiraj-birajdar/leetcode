class Solution {
    public int largestAltitude(int[] gain) {
        int r = gain[0];
        if(gain.length==1)
            return gain[0]<0? 0: gain[0];
        
        for(int i=1; i<gain.length; i++){
            gain[i] = gain[i]+gain[i-1];
            if(r<gain[i])
                r = gain[i];
        }
        return r<0? 0: r;
    }
}