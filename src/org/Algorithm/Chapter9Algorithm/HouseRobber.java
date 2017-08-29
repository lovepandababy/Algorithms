package org.Algorithm.Chapter9Algorithm;

/**
 * Created by Ellen on 2017/8/28.
 */
public class HouseRobber {

    public static void main(String[] args) {
        System.out.println(houseRobber(new int[]{828,125,740,724,983,321,773,678,841,842,875,377,674,144,340,467,625,916,463,922,255,662,692,123,778,766,254,559,480,483,904,60,305,966,872,935,626,691,832,998,508,657,215,162,858,179,869,674,452,158,520,138,847,452,764,995,600,568,92,496,533,404,186,345,304,420,181,73,547,281,374,376,454,438,553,929,140,298,451,674,91,531,685,862,446,262,477,573,627,624,814,103,294,388}));
    }

    public static long houseRobber(int[] A) {
        // write your code here
        if (A == null || A.length == 0) {
            return 0;
        }
        int len = A.length;
        if (len == 1) {
            return A[0];
        }
        long[] dp = new long[len];
        dp[0] = A[0];
        dp[1] = A[1];
        dp[2] = A[0] + A[2];
        for (int i = 3; i < len; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3]) + A[i];
        }
        return dp[len - 1] > dp[len - 2] ? dp[len - 1] : dp[len - 2];
    }
}
