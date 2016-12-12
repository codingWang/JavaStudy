package com.duweri.interview;
/**
 * http://www.importnew.com/18884.html
 * @author ¶ÅÎ°
 * 
 * »º´æ-128---127µÄÖµ
 * 
 */
public class IntegerCache {
    public static void main(String... strings) {
 
        Integer integer1 = 3;//Integer.valueOf(3);
        Integer integer2 = 3;
 
        if (integer1 == integer2)
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");
 
        Integer integer3 = 300;
        Integer integer4 = 300;
 
        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");
 
    }
}
