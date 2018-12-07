package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/19 15:47
 * @description
 */

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 马战川
 * @version 1.0
 * @className E11Iterator2String
 * @date 2018/9/19 15:47
 * @description 1.Iterator使用while (iterator.hasNext())来遍历；Collection使用foreach循环来遍历。
 */
@SuppressWarnings("unchecked")
public class E11Iterator2String {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<Integer>();
        E04MovieNameGenerator.fill(linkedList);
        outPut(linkedList);
        outPut2(linkedList);
    }

    static void outPut(Collection<String> collection) {
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }

    static void outPut2(Collection<String> collection) {
        for (String aCollection : collection) {
            System.out.println(aCollection.toString());
        }
    }
}
