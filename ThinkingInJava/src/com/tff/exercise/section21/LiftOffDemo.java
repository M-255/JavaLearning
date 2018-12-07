package com.tff.exercise.section21;
/*
 * @author 马战川
 * @date 2018/11/29 10:21
 * @description
 */

/**
 * @author 马战川
 * @version 1.0
 * @className LiftOffDemo
 * @date 2018/11/29 10:21
 * @description TODO
 */
public class LiftOffDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new LiftOff(5));
        thread.start();
        LiftOff launch = new LiftOff(50);
        launch.run();

    }

}
