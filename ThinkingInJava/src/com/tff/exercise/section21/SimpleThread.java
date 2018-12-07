package com.tff.exercise.section21;
/*
 * @author 马战川
 * @date 2018/12/3 11:25
 * @description
 */

/**
 * @author 马战川
 * @version 1.0
 * @className SimpleThread
 * @date 2018/12/3 11:25
 * @description TODO
 */
public class SimpleThread extends Thread {
    private int countDown = 5;
    private static int threadCount = 0;

    public SimpleThread() {
        super(Integer.toString(++threadCount));
        start();
    }

    @Override
    public String toString() {
        return "#" + getName() + "(" + countDown + "),";
    }

    @Override
    public void run() {
        while (true) {
            System.out.print(this);
            if (--countDown == 0) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new SimpleThread();
        }
    }
}
