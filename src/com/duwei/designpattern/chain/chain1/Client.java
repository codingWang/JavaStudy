package com.duwei.designpattern.chain.chain1;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        //1.构建责任链
        List<Ratify> ratifies = new ArrayList<>();
        ratifies.add(new Leader());
        ratifies.add(new Manager());
        ratifies.add(new Header());
        //构建请求对象
        Request request = new Request.Builder().setDays(7).setName("aaa").setReason("生病").build();
        //组装处理
        RealChain realChain = new RealChain(ratifies, request, 0);
        realChain.proceed(request);

    }

}
