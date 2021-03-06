package org.Algorithm.SwordForOffer;

/**
 * Created by Ellen on 2017/5/12.
 * 把只包含素因子2、3和5的数称作丑数（Ugly Number）。
 * 例如6、8都是丑数，但14不是，因为它包含因子7。
 * 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 */
public class GetUglyNumber_Solution {
    final int d[] = {2, 3, 5};

    public int GetUglyNumber_Solution(int index) {
        if (index == 0) return 0;
        int a[] = new int[index];
        a[0] = 1;
        int p[] = new int[]{0, 0, 0};
        int num[] = new int[]{2, 3, 5};
        int cur = 1;

        while (cur < index) {
            int m = finMin(num[0], num[1], num[2]);
            if (a[cur - 1] < num[m])
                a[cur++] = num[m];
            p[m] += 1;
            num[m] = a[p[m]] * d[m];
        }
        return a[index - 1];
    }

    private int finMin(int num2, int num3, int num5) {
        int min = Math.min(num2, Math.min(num3, num5));
        return min == num2 ? 0 : min == num3 ? 1 : 2;
    }
}
