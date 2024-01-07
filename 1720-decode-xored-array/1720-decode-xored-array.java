class Solution {
    public int[] decode(int[] encoded, int first) {
        int oa[] = new int[encoded.length+1];
        oa[0] = first;
        for(int i=1;i<encoded.length+1;i++)
        {
            oa[i] = oa[i-1] ^ encoded[i-1];
        }
        return oa;
    }
}