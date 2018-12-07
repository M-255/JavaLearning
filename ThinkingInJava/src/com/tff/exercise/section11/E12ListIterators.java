package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/19 16:16
 * @description
 */

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author 马战川
 * @version 1.0
 * @className E12ListIterators
 * @date 2018/9/19 16:16
 * @description 1.ListIterator可以双向遍历.
 *              2.ListIterator可以指定初始指针的位置。
 */
public class E12ListIterators {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        E04MovieNameGenerator.fill(list);
        List<String> list2 = new LinkedList<>(list);
        System.out.println("before,List:" + list);
        System.out.println("before,List2:" + list2);

        ListIterator<String> iterator = list.listIterator();
        ListIterator<String> iterator2 = list2.listIterator(list.size());
        while (iterator.hasNext()) {
            iterator2.previous();
            iterator2.set(iterator.next());
        }

        System.out.println("after,List:" + list);
        System.out.println("after,List2:" + list2);
    }
}
