package com.duwei.designpattern.proxy.staticproxy;

public class Proxy implements ProxyInterface {
    //这里持有真正对象的引用更清晰，注意和装饰器的区别
    private Target target;

    public Proxy() {
        this.target = new Target();
    }

    @Override
    public void proxyMethod() {
        target.proxyMethod();
    }
}
