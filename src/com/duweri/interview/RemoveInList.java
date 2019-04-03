package com.duweri.interview;

import java.util.ArrayList;
import java.util.List;

/**
 * 在for循环中删除元素的问题：删除元素会导致列表向前移动
 * 1.倒着遍历
 * 2.及时修改i值
 * 3.迭代器
 */
public class RemoveInList {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");

        for (int i = 0; i < list.size(); i++) {
            list.remove("4");
        }
    }

}
