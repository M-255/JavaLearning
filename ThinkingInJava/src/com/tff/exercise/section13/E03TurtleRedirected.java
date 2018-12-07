package com.tff.exercise.section13;
/*
 * @author 马战川
 * @date 2018/9/29 09:18
 * @description
 */

import java.io.PrintStream;
import java.util.Formatter;

/**
 * @author 马战川
 * @version 1.0
 * @className E03TurtleRedirected
 * @date 2018/9/29 9:18
 * @description 1.Formatter是一个翻译器，它将你的格式化字符串与数据翻译成结果。
 * 2.创建一个Formatter对象时候需要传入输出的位置。
 */
public class E03TurtleRedirected {
    public static void main(String[] args) {
        PrintStream outAlias = System.err;
        Turtle tom = new Turtle("tom", new Formatter(outAlias));
        tom.move(1, 3);
    }
}

class Turtle {
    private String name;
    private Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s The Turtle is at (%d,%d)\n", name, x, y);
        System.err.printf("%s The Turtle is at (%d,%d)\n", name, x, y);
    }
}