package com.tff.exercise.section14;
/*
 * @author 马战川
 * @date 2018/10/9 14:33
 * @description
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 马战川
 * @version 1.0
 * @className P338SimpleDynamicProxy
 * @date 2018/10/9 14:33
 * @description TODO
 */
public class P338SimpleDynamicProxy {
    public static void main(String[] args) {
        //被代理的对象
        RealObject realObject = new RealObject();
        //直接消费对象
        consumer(realObject);
        //创建一个代理，来消费代理，间接调用对象
        Interface proxy = (Interface) Proxy.newProxyInstance(
                Interface.class.getClassLoader(),
                new Class[]{Interface.class},
                new DynamicProxyHandler(realObject)
        );
        consumer(proxy);
    }

    public static void consumer(Interface iface) {
        iface.doSomething();
        iface.somethingElse("wolf");
    }
}

interface Interface {
    void doSomething();

    void somethingElse(String arg);
}

class RealObject implements Interface {

    @Override
    public void doSomething() {
        System.out.println("RealObject: doSomething");
    }

    @Override
    public void somethingElse(String arg) {
        System.out.println("RealObject: somethingElse. arg:" + arg);
    }
}

//代理的处理器
class DynamicProxyHandler implements InvocationHandler {
    private Object proxied;

    public DynamicProxyHandler(Object proxied) {
        this.proxied = proxied;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("****proxy:" + proxy.getClass() + ",method:" + method + ",args" + args);
        if (args != null) {
            for (Object arg : args) {
                System.out.println(" " + arg);
            }
        }
        return method.invoke(proxied, args);
    }
}
