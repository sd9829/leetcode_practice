class Solution {
    public int maxProfit(int[] prices) {
        int buyingPrice = 0;
        int currentP = 0;
        int maxP = 0;
        for(int i  =1; i<prices.length; i++){
            if(prices[i] < prices[buyingPrice])
                buyingPrice = i;
            else{
                currentP = prices[i] - prices[buyingPrice];
                maxP = Math.max(currentP, maxP);
            }
        }
        return maxP;
