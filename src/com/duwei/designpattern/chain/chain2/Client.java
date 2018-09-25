package com.duwei.designpattern.chain.chain2;

public class Client {

    public static void main(String[] args) {
        AbstractHandler A = new ConcreteHandlerA();
        AbstractHandler B = new ConcreteHandlerB();
        AbstractHandler Z = new ConcreteHandlerZ();

        A.setHandler(B);
        B.setHandler(Z);
        A.handleRequest("Z");
    }
}
