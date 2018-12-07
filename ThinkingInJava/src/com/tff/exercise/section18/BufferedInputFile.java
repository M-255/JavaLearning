package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/21 15:12
 * @description
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author 马战川
 * @version 1.0
 * @className BufferedInputFile
 * @date 2018/11/21 15:12
 * @description TODO
 */
public class BufferedInputFile {
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("./ThinkingInJava/src/com/tff/exercise/section18/BufferedInputFile.java"));
            StringBuilder stringBuilder = new StringBuilder();
            while (bufferedReader.readLine() != null) {
                stringBuilder.append(bufferedReader.readLine());
            }
            System.out.println(stringBuilder);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
