import java.util.ArrayList;
public class Buy_Sell_Stock2 {
    public static ArrayList<ArrayList<Integer>> stockSell(int price[] , int n ){
         
        int buyday = 0;
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        ArrayList<ArrayList<Integer>> result  = new ArrayList<>();
          // if the  sell price is less than buyprice
          // there will be no profit gain that's why we 
          // add sell price into buy price
        for(int i =0; i<n-1; i++){
            if( price[i] < buyprice){
                buyprice = price[i];
                buyday = i;
            }

            if(price[i+1] > buyprice){

            ArrayList<Integer> transaction = new ArrayList<>();

            transaction.add(buyday);  // add buday
            transaction.add(i + 1); // add sell day

            result.add(transaction);  // add transaction to  the result
           
            // reset buyprice after selling
           buyprice = Integer.MAX_VALUE;
      
            }
        }
        return result;

    }
        public static void main(String args[]){
        int price[] = {100,180,260,310,40,535,695};
        int  n = price.length;
          // Get the list of buy-sell transactions
          ArrayList<ArrayList<Integer>> transactions = stockSell(price, n);

          // Check if there are any profitable transactions
          if (transactions.size() == 0) {
          System.out.println("No profitable transactions found.");
          } else {
         // Print each transaction
          for (ArrayList<Integer> transaction : transactions) {
          System.out.println(transaction);
        
        }
  }
}
}
