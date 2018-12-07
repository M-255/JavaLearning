package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/21 16:06
 * @description
 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 马战川
 * @version 1.0
 * @className FormatterMemoryInput
 * @date 2018/11/21 16:06
 * @description TODO
 */
public class FormatterMemoryInput {
    public static void main(String[] args) {
        DataInputStream dataInputStream = null;
        try {
            dataInputStream = new DataInputStream(new FileInputStream("./ThinkingInJava/src/com/tff/exercise/section18/BufferedInputFile.java"));
            while (dataInputStream.available() != 0) {
                System.out.print((char) dataInputStream.readByte());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataInputStream != null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

}
