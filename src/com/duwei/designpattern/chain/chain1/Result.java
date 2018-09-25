package com.duwei.designpattern.chain.chain1;

/**
 * 请假结果
 */
public class Result {

    public boolean isAgree;
    public String info;

    public Result(){}

    public Result(boolean isAgree , String info){
        this.isAgree = isAgree;
        this.info = info;
    }

    public boolean isAgree() {
        return isAgree;
    }

    public void setAgree(boolean agree) {
        isAgree = agree;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Result{" +
                "isAgree=" + isAgree +
                ", info='" + info + '\'' +
                '}';
    }

}
