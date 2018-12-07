package com.tff.test;
/*
 * @author 马战川
 * @date 2018/9/19 08:53
 * @description
 */

import java.util.PriorityQueue;

/**
 * @author 马战川
 * @version 1.0
 * @className Test
 * @date 2018/9/19 8:53
 * @description 1.PriorityQueue优先队列，可以比较对象的优先级。
 *              2.对象必须实现Comparable接口。
 */
public class Test {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        Demo demo1 = new Demo(1);
        Demo demo2 = new Demo(2);
        Demo demo3 = new Demo(3);
        Demo demo4 = new Demo(4);
        PriorityQueue<Demo> queue = new PriorityQueue<>();
        queue.add(demo1);
        queue.add(demo2);
        queue.add(demo2);
        queue.add(demo4);
        queue.add(demo3);
        queue.add(demo3);

        //取出size是因为每次队列弹出后size都变小。所以不能当做循环条件。
        int len = queue.size();
        for (int i = 0; i < len; i++) {

            //每次offer或poll操作之后都会进行一次堆排序。
            System.out.print(queue.poll() + " ");
        }
    }
}

class Demo implements Comparable<Demo> {
    private Integer id;

    Demo(Integer id) {
        this.id = id;
    }

    @Override
    public int compareTo(Demo o) {
        return (this.id < o.id) ? -1 : ((this.id.equals(o.id)) ? 0 : 1);
    }

    @Override
    public String toString() {
        return this.id.toString();
    }
}
