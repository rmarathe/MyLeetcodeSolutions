/**
* 121. Best time to buy and sell stock
*/

public class Solution {
    public int maxProfit(int[] prices) {
        //buy at minimum price and sell at max price and t(min) < t(max)
        //maximize the difference
        if(prices == null || prices.length == 0){
            return 0;
        }
        int diff = 0;
        int max = Integer.MIN_VALUE;
        int min = prices[0];
        for(int i=0;i<prices.length;i++){
            min = Math.min(prices[i], min);
            diff = Math.max(diff, prices[i]-min);
            max = Math.max(max,diff);
        }
        return max;
    }
}

