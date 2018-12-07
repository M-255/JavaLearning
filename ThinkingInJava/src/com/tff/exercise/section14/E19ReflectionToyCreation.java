package com.tff.exercise.section14;
/*
 * @author 马战川
 * @date 2018/10/9 10:15
 * @description
 */


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author 马战川
 * @version 1.0
 * @className E19ReflectionToyCreation
 * @date 2018/10/9 10:15
 * @description TODO
 */
public class E19ReflectionToyCreation {

    private static MyToy makeToy(String toyName, int IQ) {
        try {
            Class<?> cToy = Class.forName(toyName);
            for (Constructor constructor : cToy.getConstructors()) {
                Class[] parameterTypes = constructor.getParameterTypes();
                if (parameterTypes.length == 1) {
                    if (parameterTypes[0] == int.class) {
                        return (MyToy) constructor.newInstance(new Object[]{IQ});
                    }

                }
            }

        } catch (ClassNotFoundException | IllegalAccessException | InvocationTargetException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static void main(String[] args) {
        MyToy myToy = makeToy("com.tff.exercise.section14.MyToy", 7);
        System.out.println(myToy != null ? myToy.toString() : null);

    }

}

class MyToy {
    private int IQ;

    public MyToy(int IQ) {
        this.IQ = IQ;
    }

    public String toString() {
        return "I'm a SuperToy. I'm smarter than you.";
    }
}
