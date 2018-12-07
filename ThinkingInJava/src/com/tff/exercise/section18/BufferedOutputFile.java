package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/22 10:50
 * @description
 */

import java.io.*;

/**
 * @author 马战川
 * @version 1.0
 * @className BufferedOutputFile
 * @date 2018/11/22 10:50
 * @description TODO
 */
public class BufferedOutputFile {
    public static void main(String[] args) {
        File to = new File("C:\\Users\\255\\Desktop\\1.txt");
        File from = new File("./ThinkingInJava/src/com/tff/exercise/section18/BufferedInputFile.java");

        writeToFile(from, to);

    }

    private static void writeToFile(File from, File to) {
        try {
            BufferedReader reader = null;
            BufferedWriter writer = null;
            try {
                reader = new BufferedReader(new FileReader(from));
                writer = new BufferedWriter(new FileWriter(to));
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    writer.write(line);
                    writer.newLine();
                }
                writer.flush();
            } finally {
                writer.close();
                reader.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
