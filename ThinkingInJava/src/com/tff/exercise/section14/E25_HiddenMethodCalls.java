package com.tff.exercise.section14;
/*
 * @author 马战川
 * @date 2018/10/15 14:30
 * @description
 */

import com.tff.test.A;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 马战川
 * @version 1.0
 * @className E25_HiddenMethodCalls
 * @date 2018/10/15 14:30
 * @description TODO
 */
public class E25_HiddenMethodCalls {
    static void callHiddenMethods(Object o, String methodName) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = o.getClass().getDeclaredMethod(methodName);
        method.setAccessible(true);
        method.invoke(o);
    }
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        class B extends A{
            protected void d(){
                System.out.println("B.d()");
                super.d();
            }
        }
        A a = new A();
        callHiddenMethods(a,"b");
        callHiddenMethods(a,"e");
        callHiddenMethods(a,"d");
        B b = new B();
        b.d();
    }

}
