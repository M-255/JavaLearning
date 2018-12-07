package com.tff.test;
/*
 * @author 马战川
 * @date 2018/10/29 10:11
 * @description
 */

import java.util.*;

/**
 * @author 马战川
 * @version 1.0
 * @className User
 * @date 2018/10/29 10:11
 * @description TODO
 */
public class SortHashMap {
    public static void main(String[] args) {
        HashMap<Integer, User> hashMap = new HashMap<>();
        hashMap.put(1, new User("111", 12));
        hashMap.put(2, new User("222", 17));
        hashMap.put(3, new User("333", 15));
        for (Map.Entry<Integer, User> item : sortHashMap(hashMap).entrySet()) {
            System.out.println(item.getValue().getAge());
        }

    }

    public static HashMap<Integer, User> sortHashMap(HashMap<Integer, User> targetMap) {
        //取出entry
        Set<Map.Entry<Integer, User>> entrySet = targetMap.entrySet();
        //转为List便于排序
        LinkedList<Map.Entry<Integer, User>> entryLinkedList = new LinkedList<>(entrySet);
        entryLinkedList.sort(Comparator.comparingInt(o -> o.getValue().getAge()));

        //转回Map
        LinkedHashMap<Integer, User> resultMap = new LinkedHashMap<>();
        for (Map.Entry<Integer, User> item : entryLinkedList) {
            resultMap.put(item.getKey(), item.getValue());
        }
        return resultMap;
    }
}

class User {
    private String name;

    private Integer age;

    public User(String name, Integer age) {
        this.setName(name);
        this.setAge(age);
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}