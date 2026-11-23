class Solution {
    public int maxProfit(int[] prices) {
        
        // using sliding window
        int lowestPrice = prices[0];
        int maxProfit = 0;

        for(int sell: prices){
            maxProfit = Math.max(maxProfit, sell - lowestPrice);
            lowestPrice = Math.min(lowestPrice, sell);
        }

        return maxProfit;
    }
}
