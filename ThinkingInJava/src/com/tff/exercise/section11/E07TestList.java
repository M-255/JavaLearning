package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/19 15:17
 * @description
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 马战川
 * @version 1.0
 * @className E07TestList
 * @date 2018/9/19 15:17
 * @description 1.subList创建的是对原列表的引用，任何对subList的操作都会影响到原List。
 */
public class E07TestList {
    public static void main(String[] args) {
        Myclass[] myclasses = new Myclass[7];
        for (int i = 0; i < myclasses.length; i++) {
            myclasses[i] = new Myclass();
        }

        List<Myclass> list = new ArrayList<>(Arrays.asList(myclasses));
        System.out.println("before:" + list);
        list.removeAll(list.subList(2, 5));
//        list.subList(2,5).clear();
        System.out.println("after:" + list);
        System.out.println("myclasses:" + Arrays.toString(myclasses));

    }
}

class Myclass {

}
