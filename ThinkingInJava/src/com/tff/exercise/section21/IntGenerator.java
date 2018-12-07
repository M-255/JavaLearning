package com.tff.exercise.section21;
/*
 * @author 马战川
 * @date 2018/12/4 19:38
 * @description
 */

/**
 * @author 马战川
 * @version 1.0
 * @className IntGenerator
 * @date 2018/12/4 19:38
 * @description 整数生成器
 */
public abstract class IntGenerator {
    private volatile boolean canceled = false;

    public abstract int next();

    public void cancel() {
        canceled = true;
    }

    public boolean isCanceled() {
        return canceled;
    }

}
