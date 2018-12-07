package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/19 14:00
 * @description 创建一个空的LInkedList<Integer>，通过使用ListIterator，将若干个Integer插入这个List中，插入时，总是将他们插入List的正中间。
 */

import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author 马战川
 * @version 1.0
 * @className E14LinkedListMiddleInsert
 * @date 2018/9/19 14:00
 * @description 1.每加入两个数就让指针回退一次（保证指针在ListIterator的中间）
 *              2.ListIterator可以让指针双向移动，Iterator只能单向移动。
 */
public class E14LinkedListMiddleInsert {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        ListIterator li = list.listIterator();
        for (int i = 0; i < 10; i++) {
            li.add(i);
            if (i % 2 == 1) {
                li.previous();
            }
        }
        System.out.println(list);
    }

}
