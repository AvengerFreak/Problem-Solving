// solution to problem https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
class MaxProfit {
    public int maxProfit(int[] prices) {
        
        int N = prices.length;
        boolean currentlyHoldingStock = false; // can only hold one share of stock
        int priceBought = 0,
        profit = 0;
        
        for(int i = 0; i< N - 1; i++){ // buy low and sell hight to maximize profit
            
            if(currentlyHoldingStock){
                
                if(priceBought < prices[i]){ // compare price bought with today's price to decide if profitable
                    
                    if(prices[i] > prices[i+1]){ // check if its most profitable to sell or wait and sell later
                        currentlyHoldingStock = false;
                        profit+= prices[i] - priceBought;
                        priceBought = 0;
                    }
                } 
            }
            
            else if(prices[i] < prices[i + 1]){ // check the price of the following day to decide if buying
                currentlyHoldingStock = true;
                priceBought = prices[i];
            } 
        }
        
        if(currentlyHoldingStock){
            if(priceBought < prices[N-1])
                profit+= prices[N-1] - priceBought;
            
        }
        
        return profit;
    }
}
