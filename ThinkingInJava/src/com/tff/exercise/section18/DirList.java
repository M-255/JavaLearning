package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/20 19:07
 * @description
 */

import java.io.File;
import java.util.Arrays;

/**
 * @author 马战川
 * @version 1.0
 * @className DirList
 * @date 2018/11/20 19:07
 * @description TODO
 */
public class DirList {
    public static void main(String[] args) {
        File path = new File("./ThinkingInJava/src/com/tff/exercise/section18");
//        String regex = "D.*/.java";
//        String[] list = path.list((dir, name) -> Pattern.compile(regex).matcher(name).matches());
        String[] list = path.list();
        assert list != null;
        Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
        for (String item : list) {
            System.out.println(item);
        }
    }

}
