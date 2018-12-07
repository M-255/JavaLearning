package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/25 09:28
 * @description
 */

import java.util.*;

/**
 * @author 马战川
 * @version 1.0
 * @className E24MapOder
 * @date 2018/9/25 9:28
 * @description 1.数组排序：Arrays.sort()需要传入参数；使用treeSet。
 */
public class E24MapOder {
    public static void main(String[] args) {
        Map<String, String> map1 = new LinkedHashMap<>();
        Map<String, String> map2 = new LinkedHashMap<>();
        String[] keyArray = "One two three four five five Four Three two one zero".split(" ");
        for (String item : keyArray) {
            map1.put("key " + item, "value " + item);
        }
        System.out.println("map1:" + map1);
        Set<String> keySet = new TreeSet<>(map1.keySet());
        for (String item : keySet) {
            map2.put(item, map1.get(item));
        }
        System.out.println("map2:" + map2);
    }

}
