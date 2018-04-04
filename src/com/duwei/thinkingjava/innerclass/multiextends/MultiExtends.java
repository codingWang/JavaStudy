package com.duwei.thinkingjava.innerclass.multiextends;

/**
 * 内部类实现多继承的原理
 */
public class MultiExtends {


    private class InnerOne extends ClassOne {
        public String getName() {
            return "wdw";
        }
    }

    private class InnerTwo extends ClassTwo {
        public int getAge() {
            return 11;
        }
    }


    public String getName() {
        return new InnerOne().getName();
    }

    public int getAge() {
        return new InnerTwo().getAge();
    }


}
