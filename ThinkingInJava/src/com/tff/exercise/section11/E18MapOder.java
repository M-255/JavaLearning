package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/19 17:17
 * @description
 */

import java.util.*;

/**
 * @author 马战川
 * @version 1.0
 * @className E18MapOder
 * @date 2018/9/19 17:17
 * @description 两种给set排序的方式：1.转为TreeSet；2.Set.toArray转为数组之后，调用Arrays.sort()排序。
 */
public class E18MapOder {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 7; i++) {
            hashMap.put("key" + i, "value" + i);
        }
        System.out.println(hashMap.toString());
        TreeSet<String> keySet = new TreeSet<>(hashMap.keySet());
        String[] keys = new String[keySet.size()];
        keySet.toArray(keys);
        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        for (String key : keys) {
            linkedHashMap.put(key,hashMap.get(key));
        }
        System.out.println(linkedHashMap.toString());
    }

}
