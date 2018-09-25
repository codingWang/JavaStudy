package com.duwei.designpattern.chain.chain2;

/**
 *
 */
public abstract class AbstractHandler {
    private AbstractHandler handler;

    public abstract void handleRequest(String condition);

    public AbstractHandler getHandler() {
        return handler;
    }

    public void setHandler(AbstractHandler handler) {
        this.handler = handler;
    }


}
