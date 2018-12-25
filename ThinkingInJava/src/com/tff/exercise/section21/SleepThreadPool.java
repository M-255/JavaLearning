package com.tff.exercise.section21;
/*
 * @author 马战川
 * @date 2018/12/19 18:32
 * @description
 */

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 马战川
 * @version 1.0
 * @className SleepThreadPool
 * @date 2018/12/19 18:32
 * @description TODO
 */
public class SleepThreadPool implements Runnable {
    private static final Random random = new Random();
    private final int sleepTime = random.nextInt(3) + 1;

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getId() + ":" + sleepTime);
    }

    public static void main(String[] args) {
        ExecutorService exe = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            exe.execute(new SleepThreadPool());
        }
        exe.shutdown();
    }
}
