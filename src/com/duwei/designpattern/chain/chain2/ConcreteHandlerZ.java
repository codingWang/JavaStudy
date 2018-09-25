package com.duwei.designpattern.chain.chain2;

public class ConcreteHandlerZ extends AbstractHandler {
    @Override
    public void handleRequest(String condition) {
        System.out.println("最后一个处理");
    }
}
