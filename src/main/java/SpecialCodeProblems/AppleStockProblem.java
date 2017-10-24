package SpecialCodeProblems;

/**
 * Write an efficient function that takes stockPricesYesterday and returns the best profit I could have made from 1 purchase
 * and 1 sale of 1 Apple stock yesterday.
 * Created by George Fouche on 10/8/17.
 */
public class AppleStockProblem {

    /**
     * This function will take O(n^2) since we have two nested loops.
     * we’re doing a lot of extra work. We’re looking at every pair twice. We know we have to buy before we sell,
     * so in our inner for loop we could just look at every price after the price in our outer for loop.
     *
     * @param stockPricesYesterday
     * @return
     */
    public static int getMaxProfitExample1(int[] stockPricesYesterday) {
        int maxProfit = 0;

        for (int outerTime = 0; outerTime < stockPricesYesterday.length; outerTime++) {
            for (int innerTime = 0; innerTime < stockPricesYesterday.length; innerTime++) {

                int earlierTime = Math.min(outerTime, innerTime);
                int laterTime = Math.max(outerTime, innerTime);

                int earlierPrice = stockPricesYesterday[earlierTime];
                int laterPrice = stockPricesYesterday[laterTime];

                int potentialProfit = laterPrice - earlierPrice;

                maxProfit = Math.max(maxProfit, potentialProfit);
            }
        }
        return maxProfit;
    }

    /**
     * This function will also take O(n^2) since we have two nested loops.
     * Our outer for loop goes through all the times and prices, but our inner for loop goes through one fewer price each time.
     *
     * @param stockPricesYesterday
     * @return
     */
    public static int getMaxProfitExample2(int[] stockPricesYesterday) {
        int maxProfit = 0;

        for (int earlierTime = 0; earlierTime < stockPricesYesterday.length; earlierTime++) {
            int earlierPrice = stockPricesYesterday[earlierTime];

            for (int laterTime = earlierTime + 1; laterTime < stockPricesYesterday.length; laterTime++) {
                int laterPrice = stockPricesYesterday[laterTime];

                int potentialProfit = laterPrice - earlierPrice;

                maxProfit = Math.max(maxProfit, potentialProfit);
            }
        }
        return maxProfit;
    }

    /**
     *
     *
     * @param stockPricesYesterday
     * @return
     */
    public static int getMaxProfitExample3(int[] stockPricesYesterday) {
        int maxProfit = 0;
        int minPrice = stockPricesYesterday[0];

        for (int currentPrice : stockPricesYesterday) {
            minPrice = Math.min(minPrice, currentPrice);

            int potentialProfit = currentPrice - minPrice;
            maxProfit = Math.max(maxProfit, potentialProfit);
        }
        return maxProfit;
    }

    public static int getMaxProfitExample4(int[] stockPricesYesterday) {

        if (stockPricesYesterday.length < 2) {
            throw new IllegalArgumentException("Getting a profit require at least 2 prices");
        }

        //Greedily update the minPrice and maxPrice and maximize them to
        // the first price and the first possible profit
        int minPrice = stockPricesYesterday[0];
        int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];

        // start at the second (index 1) time
        // we can't sell at the first time, since we must buy first,
        // and we can't buy and sell at the same time!
        // if we started at index 0, we'd try to buy *and* sell at time 0.
        // this would give a profit of 0, which is a problem if our
        // maxProfit is supposed to be *negative*--we'd return 0.
        for (int i = 1; i < stockPricesYesterday.length; i++) {
            int currentPrice = stockPricesYesterday[i];

            //See What our profit will be if we bought at the min price and sold at the current price.
            int potentialPrice = currentPrice - minPrice;

            //update maxProfit if we can do better
            maxProfit = Math.max(maxProfit, potentialPrice);

            // update minPrice  so it's the lowest price we seen so far
            minPrice = Math.min(minPrice, currentPrice);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[]{10, 7, 5, 8, 11, 9};
        System.out.println(getMaxProfitExample1(stockPricesYesterday));
        System.out.println(getMaxProfitExample2(stockPricesYesterday));
        System.out.println(getMaxProfitExample3(stockPricesYesterday));
        System.out.println(getMaxProfitExample4(stockPricesYesterday));
    }
}
