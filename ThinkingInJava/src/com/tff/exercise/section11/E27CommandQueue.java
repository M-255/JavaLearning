package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/25 11:08
 * @description
 */

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author 马战川
 * @version 1.0
 * @className E27CommandQueue
 * @date 2018/9/25 11:08
 * @description 1.入队列的操作：offer和add相似，不同的是，当超出队列界限时，前者返回false，后者抛出异常。
 *              2.出队列的操作：peek和element，和上类似，前者返回null，后者抛出异常。
 *              3.删除对象的操作：poll和remove，和上类似，前者返回null，后者抛出异常。
 */
public class E27CommandQueue {
    public static void main(String[] args) {
        Queue<Command> queue = new LinkedList<>();
        Provider.produce(queue);
        Consumer.consume(queue);
    }
}

class Command {
    private final String field;

    Command(String field) {
        this.field = field;
    }

    public void operation() {
        System.out.println(this.field);
    }
}

class Provider {
    public static void produce(Queue<Command> queue) {
        queue.offer(new Command("1"));
        queue.offer(new Command("2"));
        queue.offer(new Command("3"));
        queue.offer(new Command("4"));
        queue.offer(new Command("5"));
    }
}

class Consumer {
    public static void consume(Queue<Command> queue) {
        while (queue.peek() != null) {
            queue.remove().operation();
        }
    }
}