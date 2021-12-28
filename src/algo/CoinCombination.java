package algo;

import java.util.ArrayList;

public class CoinCombination {
    public static void main(String[] args) {
        int[] coin = {2, 3, 5};
        int sum = 9;
        System.out.println(dynamic(coin, sum));
    }

    static long dynamic(int[] coin, int sum) {
        long[] dp = new long[sum + 1];
        dp[0] = 1;
        for(int i = 0; i < coin.length; i++) {
            for(int j = 1; j <= sum; j++) {
                if(coin[i] > j) continue;
                dp[j] = dp[j] % 1000000007 + dp[j - coin[i]] % 1000000007;
            }
        }
        return dp[sum] % 1000000007;
    }
    static void coin(int[] coin, int sum, int n, ArrayList<Integer> result) {
        if(sum == 0) {
            System.out.println(result);
            return;
        }

        if(sum < 0 || n == 0) return;

        if(coin[n - 1] > sum) coin(coin, sum, n - 1, result);
        else {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.addAll(result);
            coin(coin, sum, n - 1, temp);
            temp.add(coin[n - 1]);
            coin(coin, sum - coin[n - 1], n, temp);
        }
    }
}
