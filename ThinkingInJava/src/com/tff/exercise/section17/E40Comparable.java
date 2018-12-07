package com.tff.exercise.section17;
/*
 * @author 马战川
 * @date 2018/10/25 08:50
 * @description
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * @author 马战川
 * @version 1.0
 * @className E40Comparable
 * @date 2018/10/25 8:50
 * @description TODO
 */
public class E40Comparable {
    public static void main(String[] args) {
//        Random random = new Random(47);
        ArrayList<SubComparable> arrayList = new ArrayList<>();
        for (Integer i = 10; i > 0; --i) {
            arrayList.add(new SubComparable(i.toString(), "name" + i.toString()));
        }
        for (SubComparable item : arrayList) {
            System.out.println(item.toString());
        }
        Collections.sort(arrayList);
        for (SubComparable item : arrayList) {
            System.out.println(item.toString());
        }

    }
}

class SubComparable implements Comparable<SubComparable> {

    private String ide;
    private String name;

    public SubComparable(String ide, String name) {
        this.ide = ide;
        this.name = name;
    }

    @Override
    public int compareTo(SubComparable o) {
        return this.ide.compareTo(o.ide);
    }

    @Override
    public String toString() {
        return "SubComparable{" +
                "ide='" + ide + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
