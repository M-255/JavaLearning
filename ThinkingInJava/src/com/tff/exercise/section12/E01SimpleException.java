package com.tff.exercise.section12;
/*
 * @author 马战川
 * @date 2018/9/26 13:48
 * @description
 */

/**
 * @author 马战川
 * @version 1.0
 * @className E01SimpleException
 * @date 2018/9/26 13:48
 * @description TODO
 */
public class E01SimpleException {
    public static void main(String[] args) {
        Thrower thrower = new Thrower();
        try {
            thrower.f();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.printf("end%d",1);
        }

    }

}

class Thrower{
    public void f() throws SimpleException{
        throw new SimpleException("simple exception!");
    }
}

class SimpleException extends Exception {
    private String msg;

    public String getMsg() {
        return msg;
    }

    public SimpleException(String message) {
        this.msg = message;
    }

}