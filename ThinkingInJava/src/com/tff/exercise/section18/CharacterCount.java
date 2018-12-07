package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/22 14:34
 * @description
 */

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 马战川
 * @version 1.0
 * @className WordCount
 * @date 2018/11/22 14:34
 * @description 练习17：用TextFile和Map<Character,Integer>创建一个程序，它可以对在一个文件中所有不同的字符出现的次数进行计数。</>
 */
public class CharacterCount {
    public static void main(String[] args) {
        File file = new File("./ThinkingInJava/src/com/tff/exercise/section18/CharacterCount.java");
        Map<Character, Integer> map = new HashMap<>();
        String text = readText(file);
        count(map, text);
        System.out.println(map.toString());
    }

    private static String readText(File file) {
        if (file == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                sb.append(line.replaceAll(" ", ""));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert bufferedReader != null;
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }

    private static void count(Map<Character, Integer> map, String text) {
        if (text == null || text.trim().length() == 0) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        for (Character character : text.toCharArray()) {
            Integer integer = map.get(character);
            map.put(character, integer == null ? 1 : integer + 1);
        }
    }
}
