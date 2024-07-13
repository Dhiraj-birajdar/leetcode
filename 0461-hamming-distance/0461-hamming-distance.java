class Solution {
    public int hammingDistance(int x, int y) {
        int xor = x^y, c;
        for( c = 0;xor!=0;xor>>=1){
            if((xor&1)==1) c++;
        }
        return c;
    }
}