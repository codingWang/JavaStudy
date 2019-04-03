package com.duweri.interview;

/**
 * 分离数组中的正负数
 */
public class ArrayNumSplit {

    static int array[] = {1, -5, 2, 6, -7, 5, -4, 7};

    public static void main(String[] args) {
        int i = 0, j = array.length - 1;
        while (i < j) {
            if (array[i] > 0 && array[j] < 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }

            if (array[i] < 0) {
                i++;
            }

            if (array[j] > 0) {
                j--;
            }
        }
        print(array);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ",");
        }
    }

}
