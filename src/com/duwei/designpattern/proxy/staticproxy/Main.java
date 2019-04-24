package com.duwei.designpattern.proxy.staticproxy;

/**
 * 静态代理
 *
 * 1.实现共同接口，或抽象类
 *
 * 2.代理类持有被代理类的抽象引用
 */
public class Main {

    public static void main(String[] args) {

        Proxy proxy = new Proxy();

        proxy.proxyMethod();

    }

}
