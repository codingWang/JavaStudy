package com.duwei.designpattern.proxy.staticproxy;

public class Target implements ProxyInterface {
    @Override
    public void proxyMethod() {
        System.out.println("我是被代理类");
    }
}
