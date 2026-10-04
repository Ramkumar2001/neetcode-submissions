class Solution {
    public int maxProfit(int[] prices) {
        int[][] cache = new int[prices.length][2];
        for(int[] arr: cache){
            Arrays.fill(arr, Integer.MAX_VALUE);
        }
        return dfs(0, prices, false, cache);
    }

    private int dfs(int i, int[] prices, boolean hasBought, int[][] cache){
        if(i == prices.length) return 0;

        int bool = (hasBought == true)? 1:0;

        if(cache[i][bool] != Integer.MAX_VALUE){
            return cache[i][bool];
        }

        int maxProfit = 0;
        if(!hasBought){
            maxProfit = Math.max(maxProfit, dfs(i+1, prices, true, cache) - prices[i]); // buy
        }
        if(hasBought){
            maxProfit = Math.max(maxProfit, dfs(i+1, prices, false, cache) + prices[i]); // sell
        }
        
        maxProfit = Math.max(maxProfit, dfs(i+1, prices, hasBought, cache));

        return cache[i][bool] = maxProfit;

    }
}