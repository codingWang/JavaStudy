package com.duweri.interview.trycatch;

public class TryCatchFinally2 {

    public static void test8(){
        try {
            System.out.println("try");
            throw new Exception();
        } catch (Exception e) {
            System.out.println("catch");
            return;
        }finally{
            System.out.println("finally");
        }
    }

    public static void main(String[] args) {
        TryCatchFinally2.test8();
    }
}
