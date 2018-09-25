package com.duwei.designpattern.chain.chain2;

public class ConcreteHandlerB extends AbstractHandler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("B")) {
            System.out.println("B处理");
        } else {
            super.getHandler().handleRequest(condition);
        }
    }
}
