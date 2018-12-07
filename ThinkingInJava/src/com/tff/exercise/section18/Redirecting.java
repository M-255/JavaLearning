package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/26 15:29
 * @description
 */

import java.io.*;

/**
 * @author 马战川
 * @version 1.0
 * @className Redirecting
 * @date 2018/11/26 15:29
 * @description TODO
 */
public class Redirecting {
    public static void main(String[] args) throws IOException {
        PrintStream console = System.out;

        BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File("./ThinkingInJava/src/com/tff/exercise/section18/CharacterCount.java")));
        PrintStream out = new PrintStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\255\\Desktop\\1.txt")));

        System.setIn(in);
        System.setOut(out);
        System.setErr(out);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }
        out.close();
        System.setOut(console);
    }
}
