class Solution {
    public int getLucky(String s, int k) {
        int res = s.chars().map(c -> {
            int n = (c + 1) - 'a';
            return n / 10 + n % 10;
        }).sum();
        for (int i = 2; i <= k; i++) {
            res = digitSum(res);
        }
        return res;
    }

    private int digitSum(int n) {
        int sum = 0;
        for (; n != 0; n /= 10) {
            sum += (n % 10);
        }
        return sum;
    }
}