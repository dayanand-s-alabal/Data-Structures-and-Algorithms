class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;
        // for(int i=0;i<prices.length-1;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if(prices[j] - prices[i] > max){
        //             max = prices[j] - prices[i];
        //         }
        //     }
        // }
        
        for(int price : prices){
            if(price < minPrice){
                minPrice = price;
            }else{
                max = max > (price - minPrice)? max : (price - minPrice);
            }
        }

        return max;
    }
}