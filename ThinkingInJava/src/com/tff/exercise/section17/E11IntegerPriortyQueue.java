package com.tff.exercise.section17;
/*
 * @author 马战川
 * @date 2018/10/23 09:42
 * @description
 */

import java.util.*;

/**
 * @author 马战川
 * @version 1.0
 * @className E11IntegerPriortyQueue
 * @date 2018/10/23 9:42
 * @description TODO
 */
public class E11IntegerPriortyQueue {
    public static void main(String[] args) {
        PriorityQueue<IntegerCompare> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < 10; i++) {
            priorityQueue.add(new IntegerCompare());
        }
        IntegerCompare integerCompare;
        while ((integerCompare = priorityQueue.poll()) != null) {
            System.out.println(integerCompare.toString());
        }

    }
}

class IntegerCompare implements Comparable<IntegerCompare> {
    private static Random random = new Random(47);
    private final Integer id = random.nextInt(101);

    @Override
    public int compareTo(IntegerCompare o) {
        return this.id.compareTo(o.id);
    }

    @Override
    public String toString() {
        return id.toString();
    }
}