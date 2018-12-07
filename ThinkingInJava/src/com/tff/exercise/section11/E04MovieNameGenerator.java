package com.tff.exercise.section11;
/*
 * @author 马战川
 * @date 2018/9/19 14:45
 * @description
 */

import java.util.*;

/**
 * @author 马战川
 * @version 1.0
 * @className E04MovieNameGenerator
 * @date 2018/9/19 14:45
 * @description 1.使用取余来实现计数器循环执行，并将计数器设置为成员变量。
 *              2.所有存储对象都实现了Collection
 */
public class E04MovieNameGenerator {
    private static final MovieNameGenerator mvnGenerator = new MovieNameGenerator();

    public static String[] fill(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = mvnGenerator.next();
        }
        return arr;
    }

    public static Collection<String> fill(Collection<String> collection){
        for (int i = 0; i < 3; i++) {
            collection.add(mvnGenerator.next());
        }
        return collection;
    }

    public static void main(String[] args){
        System.out.println(Arrays.toString(fill(new String[3])));
        System.out.println(fill(new ArrayList<>()));
        System.out.println(fill(new LinkedList<>()));
        System.out.println(fill(new HashSet<>()));
        System.out.println(fill(new LinkedHashSet<>()));
        System.out.println(fill(new TreeSet<>()));
    }

}

class MovieNameGenerator {
    private static final String[] names = {"09", "00", "03", "02", "04", "05", "06"};
    private int next;

    String next() {
        String result = names[next];
        next = (next + 1) % names.length;
        return result;
    }
}
