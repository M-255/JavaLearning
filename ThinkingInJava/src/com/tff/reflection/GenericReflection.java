package com.tff.reflection;
/*
 * @author 马战川
 * @date 2018/12/25 16:08
 * @description
 */

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 马战川
 * @version 1.0
 * @description
 * @className   通过反射越过泛型检查
 *              例如：有一个String泛型的集合，怎样能向这个集合中添加一个Integer类型的值？
 * @date 2018/12/25 16:08
 */
@SuppressWarnings("unchecked")
public class GenericReflection {
    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        Class clazz = list.getClass();
        Method addMethod = clazz.getMethod("add", Object.class);
        addMethod.invoke(list,100);
        //遍历集合
        for (Object o : list) {
            System.out.println(o);
        }
    }

}
