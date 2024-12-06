public class Buy_Sell_Stock {
    public static int buyPrice(int prices[]){
        int n = prices.length;
        int buyprice = Integer.MAX_VALUE; // creating a variable and assign it maximum value
        int maxprofit = 0;
        for(int i =0; i<n; i++){
            if(buyprice < prices[i]){  // calculate profit
                int profit = prices[i] - buyprice;  // today's profit
                maxprofit = Math.max(maxprofit , profit); // global profit all day's profit
            }
            // if we won't get profit
            else{
                buyprice = prices[i];
            }
        } 
        System.out.print("The max profit is:")
        return maxprofit;
    }
    public static void main(String args[]){
        int prices[] = {7,1,5,3,6,4};  // creating array of price
        System.out.println(buyPrice(prices));
    }
}
