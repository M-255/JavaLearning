package com.tff.exercise.section21;
/*
 * @author 马战川
 * @date 2018/11/29 10:09
 * @description
 */

/**
 * @author 马战川
 * @version 1.0
 * @className LiftOff
 * @date 2018/11/29 10:09
 * @description TODO
 */
public class LiftOff implements Runnable {
    private static int taskCount = 0;

    private final int id = taskCount++;

    protected int countDown = 10;

    public LiftOff() {
    }

    public LiftOff(int taskCount) {
        this.countDown = taskCount;
    }

    public String status() {
        return "#" + id + "(" + (countDown > 0 ? countDown : "LiftOff!") + "),";
    }

    @Override
    public void run() {
        while (countDown-- > 0) {
            System.out.println(status());
        }
        Thread.yield();
    }
}
