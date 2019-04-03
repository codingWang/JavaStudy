package com.duwei.lintcode;

import java.util.PriorityQueue;

/**
 * LintCode:791
 * 给出n个数，现在要将这n个数合并成一个数，每次只能选择两个数a,b合并，
 * 每次合并需要消耗a+b的能量，输出将这n个数合并成一个数后消耗的最小能量。
 */
public class MergeNum {

    public int mergeNum(int[] nums) {
        PriorityQueue<Integer> mHeap = new PriorityQueue<>();//小根堆
        int value = 0;

        for (int num : nums) {//全部add进去构造堆
            mHeap.add(num);
        }

        while (mHeap.size() > 1) {
            int num1 = mHeap.remove();
            int num2 = mHeap.remove();
            int afterAdd = num1 + num2;
            value += afterAdd;
            mHeap.add(afterAdd);
        }

        return value;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        MergeNum mergeNum = new MergeNum();
        System.out.print(mergeNum.mergeNum(a));

    }


}
