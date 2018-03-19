package com.duwei.generic;

/**
 * 泛型方法
 */
public class GenericFunction {

    public static void main(String[] args) {

    }

    public <T> T gf(Class<T> t) throws IllegalAccessException, InstantiationException {
        return t.newInstance();
    }

}
