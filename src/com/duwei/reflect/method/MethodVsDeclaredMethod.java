package com.duwei.reflect.method;

import java.lang.reflect.Method;

/**
 * 演示了clazz.getMethods();和clazz.getDeclaredMethods();的区别
 *   getMethods 只能拿到public方法（包括继承的类或接口的方法）
 *  getDeclaredMethods 拿到类或接口声明的所有方法，包括公共、保护、
 * 默认（包）访问和私有方法，但不包括继承的方法。
 */

public class MethodVsDeclaredMethod extends MethodFather implements Runnable{

    public static void main(String[] args) {

        Class clazz = MethodVsDeclaredMethod.class;

        Method[] methods = clazz.getMethods();

        Method[] declaredMethods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            System.out.println(method.getName());
            /**
             * main
             *MethodInInterface
             *MethodInFatherPublic
             *wait
             *wait
             *wait
             *equals
             *toString
             *hashCode
             *getClass
             *notify
             *notifyAll
             */
        }

        System.out.println("---------------");

        for (Method method : declaredMethods) {
            System.out.println(method.getName());
            /**
             * main
             */
        }

    }

    private void methodDemoPrivate(){

    }

    public void methodDemoPublic(){

    }

    @Override
    public void run() {

    }
}
