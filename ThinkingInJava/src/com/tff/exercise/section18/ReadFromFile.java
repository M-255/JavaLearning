package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/21 15:35
 * @description
 */

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author 马战川
 * @version 1.0
 * @className ReadFromFile
 * @date 2018/11/21 15:35
 * @description TODO
 */
public class ReadFromFile {
    public static void main(String[] args) {
        File file = new File("./ThinkingInJava/src/com/tff/exercise/section18/BufferedInputFile.java");
        String word = "stringBuilder";
        try {
            LinkedList<String> list = readFromFile(file);
            ListIterator<String> iterator = list.listIterator(list.size());
            while (iterator.hasPrevious()) {
                String line = iterator.previous();
                if (line.contains(word))
                    System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static LinkedList<String> readFromFile(File file) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(file));
        String line;
        LinkedList<String> result = new LinkedList<>();
        while ((line = bf.readLine()) != null) {
            result.add(line);
        }
        bf.close();
        return result;
    }
}
