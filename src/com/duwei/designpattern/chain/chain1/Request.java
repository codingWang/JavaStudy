package com.duwei.designpattern.chain.chain1;

/**
 * 使用建造者模式构建一个请假对象
 */
public class Request {
    /**
     * 请假人的姓名
     */
    private String name;
    /**
     * 请假原因
     */
    private String reason;
    /**
     * 请假天数
     */
    private int days;
    /**
     * 一级leader意见
     */
    private String leaderInfo;
    /**
     * 二级leader意见
     */
    private String managerInfo;
    /**
     * 三级leader意见
     */
    private String headerInfo;

    public Request(Builder builder) {
        this.name = builder.name;
        this.reason = builder.reason;
        this.days = builder.days;
        this.leaderInfo = builder.leaderInfo;
        this.managerInfo = builder.managerInfo;
        this.headerInfo = builder.headerInfo;
    }

    public static class Builder {
        /**
         * 请假人的姓名
         */
        private String name;
        /**
         * 请假原因
         */
        private String reason;
        /**
         * 请假天数
         */
        private int days;
        /**
         * 一级leader意见
         */
        private String leaderInfo;
        /**
         * 二级leader意见
         */
        private String managerInfo;
        /**
         * 三级leader意见
         */
        private String headerInfo;

        public Builder() {
        }

        public Builder newRequest(Request request) {
            this.name = request.name;
            this.days = request.days;
            this.reason = request.reason;
            if (request.getLeaderInfo() != null
                    && !request.getLeaderInfo().equals("")) {
                this.leaderInfo = request.leaderInfo;
            }

            if (request.managerInfo != null && !request.managerInfo.equals("")) {
                this.managerInfo = request.managerInfo;
            }

            if (request.headerInfo != null
                    && !request.headerInfo.equals("")) {
                this.headerInfo = request.headerInfo;
            }

//            if (request.customInfo != null && !request.customInfo.equals("")) {
//                this.customInfo = request.customInfo;
//            }

            return this;
        }


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setReason(String reason) {
            this.reason = reason;
            return this;
        }

        public Builder setDays(int days) {
            this.days = days;
            return this;
        }

        public Builder setLeaderInfo(String leaderInfo) {
            this.leaderInfo = leaderInfo;
            return this;
        }

        public Builder setManagerInfo(String managerInfo) {
            this.managerInfo = managerInfo;
            return this;
        }

        public Builder setHeaderInfo(String headerInfo) {
            this.headerInfo = headerInfo;
            return this;
        }

        public Request build() {
            return new Request(this);
        }

    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getLeaderInfo() {
        return leaderInfo;
    }

    public void setLeaderInfo(String leaderInfo) {
        this.leaderInfo = leaderInfo;
    }

    public String getManagerInfo() {
        return managerInfo;
    }

    public void setManagerInfo(String managerInfo) {
        this.managerInfo = managerInfo;
    }

    public String getHeaderInfo() {
        return headerInfo;
    }

    public void setHeaderInfo(String headerInfo) {
        this.headerInfo = headerInfo;
    }
}
