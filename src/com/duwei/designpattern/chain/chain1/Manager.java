package com.duwei.designpattern.chain.chain1;


public class Manager implements Ratify {

    @Override
    public Result deal(Chain chain) {
        Request request = chain.request();
        System.out.println("Manager=====>request:" + request.toString());
        if (request.getDays() > 3) {
            // 构建新的Request
            Request newRequest = new Request.Builder().newRequest(request)
                    .setManagerInfo(request.getName() + "每月的KPI考核还不错，可以批准")
                    .build();
            return chain.proceed(newRequest);

        }
        return new Result(true, "Manager：早点把事情办完，项目离不开你");
    }

}
