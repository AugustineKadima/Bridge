package integers;

public class FindBestTimeToSellStock {
    public static int maxProfit(int[] prices){
        if(prices.length < 2) return 0;
        int minVal = prices[0];
        int maxVal = 0;

        for(int i = 0; i < prices.length; i++){
                if(prices[i] < minVal){
                    minVal = prices[i];
                }else if(prices[i] - minVal > maxVal){
                    maxVal = prices[i] -minVal;
                }
        }

        return maxVal;
    }
    public static void main(String[] args) {
        int result = FindBestTimeToSellStock.maxProfit(new int[] {7,1,5,3,6,4});
        System.out.println(result);
    }
}
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Input: prices = [7,6,4,3,1]
//Output: 0
//You can not buy at the end of the week and sell at the beginning

//Pseudocode
//----------
//Loop through the array
//Look for the minimum number
//compare with the rest and find the other number that returns the greatest difference
//The difference between the two is the max profit