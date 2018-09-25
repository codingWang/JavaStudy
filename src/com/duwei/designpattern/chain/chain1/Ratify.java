package com.duwei.designpattern.chain.chain1;

public interface Ratify {
    Result deal(Chain chain);

    /**
     * 接口描述：对request和Result封装，用来转发
     */
    interface Chain {
        // 获取当前request
        Request request();

        // 转发request
        Result proceed(Request request);
    }

}
