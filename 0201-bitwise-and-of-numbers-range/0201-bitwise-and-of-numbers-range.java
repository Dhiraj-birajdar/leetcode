class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        // while(left<right){
        //     right = right & (right-1);
        // }
        // return right;
        
        int c = 0;
		while(left != right) {
			left = left>>1;
        	right = right>>1;
        	c++;
		}
		return left << c;
    }
}