package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/25 09:52
 * @description
 */

import java.util.*;

/**
 * @author 马战川
 * @version 1.0
 * @className E25WordsInfo
 * @date 2018/9/25 9:52
 * @description 1.无论map中是否已有当前的单词，都要进行添加位置信息的操作。
 * 2.判断map是否包含某个键，最好使用Map.get来判断返回值是否为空。
 * 3.遍历存储集合，如果要取出集合中的对象，首先要选择合适的存储集合来存储取出的对象。
 * 4.遍历Map，可以使用Map.foreach(Java8引入的箭头函数);
 */
public class E25WordsInfo {
    public static void main(String[] args) {
        String[] arr = "One two three four five five Four Three two one zero".split(" ");
        Map<String, ArrayList<Integer>> result = counter2(arr);
        outPut(result);
    }

    private static void counter(String[] target) {
        Map<String, ArrayList<Integer>> countMap = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            if (countMap.containsKey(target[i])) {
                countMap.get(target[i]).add(i);
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i);
                countMap.put(target[i], list);
            }
        }
        System.out.println(countMap);
    }

    private static Map<String, ArrayList<Integer>> counter2(String[] target) {
        Map<String, ArrayList<Integer>> countMap = new HashMap<>();
        for (int i = 0; i < target.length; i++) {
            ArrayList<Integer> arrayList = countMap.computeIfAbsent(target[i], k -> new ArrayList<>());
            arrayList.add(i);
        }
        return countMap;
    }

    private static void outPut(Map<String, ArrayList<Integer>> target) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        target.forEach((key, value) -> {
            for (Integer index : value) {
                treeMap.put(index, key);
            }
        });
        System.out.println(treeMap);
    }
}
