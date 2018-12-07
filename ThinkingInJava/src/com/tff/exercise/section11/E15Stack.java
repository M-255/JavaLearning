package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/18 10:45
 * @description
 */

import java.util.Stack;

/**
 * @author 马战川
 * @version 1.0
 * @className StackTest
 * @date 2018/9/18 10:45
 * @description 1.栈的入栈和出栈操作：push()、pop()
 */
public class E15Stack {
    public static void main(String args[]) {
        _test("+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---");
    }

    @SuppressWarnings("unchecked")
    private static void test(String target) {
        char[] chars = target.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < chars.length; i++) {
            //入栈
            if ('+' == (chars[i])) {
                if ('+' == (chars[i + 1]) || '-' == (chars[i + 1])) {
                    stack.push("");
                } else {
                    stack.push(chars[i + 1]);
                }
            }
            //出栈
            if ('-' == (chars[i])) {
                System.out.print(stack.pop());
            }

        }
    }

    @SuppressWarnings("unchecked")
    private static void _test(String target) {
        char[] chars = target.toCharArray();
        Stack stack = new Stack();
        for (int i = 0; i < chars.length; ) {
            switch (chars[i++]) {
                case '+':
                    stack.push(chars[i++]);
                    break;
                case '-':
                    System.out.print(stack.pop());
            }

        }
    }

}
