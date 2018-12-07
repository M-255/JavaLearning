package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/19 14:11
 * @description
 */

import java.util.ArrayList;

/**
 * @author 马战川
 * @version 1.0
 * @className E01Gerbil
 * @date 2018/9/19 14:11
 * @description ArrayList可以调用get(Int i)方法来随机访问。
 */
public class E01Gerbil {
    public static void main(String[] args) {
        ArrayList<Gerbil> gerbils = new ArrayList<>();
        //添加Gerbil
        for (int i = 0; i < 5; i++) {
            gerbils.add(new Gerbil(i));
        }
        //打印
        for (int i = 0; i < gerbils.size(); i++) {
            gerbils.get(i).hop();
        }
    }

}

class Gerbil {
    private int gerbilNumber;

    Gerbil(int gerbilNumber) {
        this.gerbilNumber = gerbilNumber;
    }

    public void hop() {
        System.out.println("gerbil:" + this.gerbilNumber + " is jumping!");
    }
}
