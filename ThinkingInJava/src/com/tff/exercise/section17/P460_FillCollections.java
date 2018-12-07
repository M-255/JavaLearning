package com.tff.exercise.section17;
/*
 * @author 马战川
 * @date 2018/10/16 14:47
 * @description
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P460_FillCollections {

    public static void main(String[] args) {
        List<StringAddress> list = new ArrayList<>(Collections.nCopies(4, new StringAddress("Hello")));
        System.out.println(list);
        Collections.fill(list, new StringAddress("World!"));
        System.out.println(list);
    }

}

class StringAddress {
    private String s;

    public StringAddress(String s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return super.toString() + " " + s;
    }
}