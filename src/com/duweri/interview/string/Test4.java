package com.duweri.interview.string;

public class Test4 {

    public static void main(String[] args) {
        Test4.test1();
        Test4.test2();
    }

    private static void test1(){
        String s1 ="abc";
        String s2 ="a";
        String s3 = "bc";
        String s4 = s2 + s3;
        System.out.println(s1 == s4);
    }


    private static void test2(){
        String s1 ="abc";
        final String s2 ="a";
        final String s3 = "bc";
        String s4 = s2 + s3;
        System.out.println(s1 == s4);
    }

}
