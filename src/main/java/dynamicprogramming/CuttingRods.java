package dynamicprogramming;

/**
 * Given a rod of length n and prices P[i] for i =1,...,n,
 * where P[i] is the price of a rod of length i.
 * Find the maximum total revenue you can make by cutting and selling the rod.
 * Assume no cost for cutting the rod.
 */
public class CuttingRods {


    int revenue(int n, int[] prices) {
        if (n == 0) return 0;
        int max_val = -1;
        for (int i = 0; i < n; ++i) {
            int temp = prices[n - i - 1] + revenue(i, prices);
            if (temp > max_val) {
                max_val = temp;
            }
        }
        return max_val;
    }

    int revenue2(int n, int[] prices) {
        int[] rod = new int [n+1];
        rod[0] = 0;
        for (int i = 1; i<= n; i++){
            int max = -1;
            for(int j =1; j<= i; j++){
                int temp = prices[j-1] + rod[i-j];
                if(temp > max){
                    max = temp;
                }
            }
         rod[i] = max;
        }
        return rod[n];

    }



    public static void main(String[] args) {
        int[] prices = {1, 5, 8, 9, 10};
        CuttingRods cuttingRods = new CuttingRods();
        System.out.println(cuttingRods.revenue(5, prices));// you can break the rod into 2 and 3
        System.out.println(cuttingRods.revenue2(5, prices));// you can break the rod into 2 and 3
    }
}
