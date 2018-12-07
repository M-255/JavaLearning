package com.tff.test;
/*
 * @author 马战川
 * @date 2018/9/30 16:27
 * @description
 */

import java.util.HashMap;
import java.util.Map;

/**
 * @author 马战川
 * @version 1.0
 * @className Test2
 * @date 2018/9/30 16:27
 * @description TODO
 */
public class Test2 {
    public static void main(String[] args){
        Map<Toy,Toy> map = new HashMap<>();
        map.put(new SubToy(1),new SubToy(1));
    }

}

class Toy{
    private int high;

    Toy(int high){
        this.high = high;
    }

    public void wolf(){
        System.err.println(this.high);
    }
}

class SubToy extends Toy{

    SubToy(int high) {
        super(high);
    }
}
