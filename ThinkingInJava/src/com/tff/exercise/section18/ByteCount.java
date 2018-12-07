package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/22 14:34
 * @description
 */

import java.io.*;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @author 马战川
 * @version 1.0
 * @className WordCount
 * @date 2018/11/22 14:34
 * @description 练习17：用TextFile和Map<Character,Integer>创建一个程序，它可以对在一个文件中所有不同的字符出现的次数进行计数。</>
 */
public class ByteCount {
    public static void main(String[] args) {
        File file = new File("./ThinkingInJava/src/com/tff/exercise/section18/CharacterCount.java");
        Map<Byte, Integer> map = new HashMap<>();
        byte[] text = readByte(file);
        count(map, text);
        System.out.println(map.toString());
    }

    private static byte[] readByte(File file) {
        if (file == null) {
            return null;
        }
        BufferedInputStream in = null;
        byte[] bytes = null;
        try {
            in = new BufferedInputStream(new FileInputStream(file));
            bytes = new byte[in.available()];
            in.read(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bytes;
    }

    private static void count(Map<Byte, Integer> map, byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        for (byte item : bytes) {
            Integer integer = map.get(item);
            map.put(item, integer == null ? 1 : integer + 1);
        }
    }
}
