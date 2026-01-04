class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0, buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPrice) {
                buyPrice = prices[i];
            } else if (prices[i] > buyPrice) {
                maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            }
        }
        return maxProfit;
    }
//keep buyPrice variable now iterate over array if prices[i] < buyPrice update buyPrice = prices[i] if prices[i] > buyPrice then calculate profit and update maxProfit


//below does same by updating maxProfit and min buyPrice
    public int __maxProfit(int[] prices) {
        int maxProfit = 0, buyPrice = prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i] - buyPrice);
            buyPrice = Math.min(prices[i], buyPrice);
        }
        return maxProfit;
    }
}