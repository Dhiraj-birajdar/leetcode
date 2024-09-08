class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0,buy=prices[0],sell=prices[0];
        for(int i = 1;i<prices.length;i++){
            if(prices[i]<buy){
                buy = prices[i];
                sell = buy;
            } 
            if(prices[i]>sell) sell = prices[i];
            if(profit< sell-buy) profit = sell-buy;
        }
        return profit;        
    }
}