package com.tff.exercise.section21;
/*
 * @author 马战川
 * @date 2018/11/30 09:12
 * @description
 */

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author 马战川
 * @version 1.0
 * @className Printer
 * @date 2018/11/30 9:12
 * @description TODO
 */
class SleepTask implements Runnable {
    private static Random random = new Random();
    private final int sleepTime = random.nextInt(3) + 1;

    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(sleepTime);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task" + Thread.currentThread().getId() + ":" + sleepTime + "s");
    }
}

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exe = Executors.newCachedThreadPool();
        for (int i = 0; i < 7; i++) {
            exe.execute(new SleepTask());
        }
        exe.shutdown();

    }

}
