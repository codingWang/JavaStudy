package com.duweri.interview.trycatch;

/**
 * 考察代码执行流程：
 * return a+b只是将返回值保存在了临时栈中。先执行finally，然后请求返回命令，才返回临时栈
 */
public class TryCatchFinally {

    public int add(int a, int b) {
        try {
            return a + b;
        } catch (Exception e) {
            System.out.println("catch");
        } finally {
            System.out.println("finally");
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println("=" + new TryCatchFinally().add(1, 5));
    }
}
