package org.Algorithm.SwordForOffer;

/**
 * Created by Ellen on 2017/5/6.
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非递减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class RotateNumber {
    public int minNumberInRotateArray(int[] array) {
        int higt = array.length - 1;
        int low = 0;
        int mid = 0;
        while (higt > low) {
            mid = (higt + low) / 2;
            if (array[mid] > array[higt]) {
                low = mid + 1;
            } else if (array[mid] < array[higt]) {
                higt--;
            } else {
                return array[low];
            }
        }
        return array[low];
    }
}