package com.duweri.interview.search;

public class OrderSearch {

    /**顺序查找平均时间复杂度 O（n）
     * @param searchKey 要查找的值
     * @param array 数组（从这个数组中查找）
     * @return  查找结果（数组的下标位置）
     */
    public static int orderSearch(int searchKey,int[] array){
        if(array==null||array.length<1)
            return -1;
        for(int i=0;i<array.length;i++){
            if(array[i]==searchKey){
                return i;
            }
        }
        return -1;

    }
}
