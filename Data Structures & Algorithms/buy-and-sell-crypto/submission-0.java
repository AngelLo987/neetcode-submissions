class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0; 
        int left = 0;

        for(int right = 0; right < prices.length; right++) {
            
            if(prices[left] > prices[right]) {
                left = right; 
            } else {
                int profit = prices[right] - prices[left]; 
                if(maxProfit < profit) {
                    maxProfit = profit; 
                } 
            }

        }


        return maxProfit;
    }
}
