class Solution {
    static int count1(int i) {
        int c = 0;
        while (i != 0) {
            c += i & 1;
            i >>= 1;
        }
        return c;
    }

    public int[] countBits(int n) {
        int ans[] = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            // ans[i]=Integer.bitCount(i);
            ans[i] = count1(i);
        }
        return ans;
    }
}