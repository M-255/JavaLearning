package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/26 14:53
 * @description
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 马战川
 * @version 1.0
 * @className Echo
 * @date 2018/11/26 14:53
 * @description TODO
 */
public class Echo {
    public static void main(String[] args) throws IOException {
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = stdin.readLine()) != null) {
            if ("#end".equals(line)) {
                stdin.close();
                System.exit(0);
            }
            if (line.length() == 0) {
                continue;
            }
            System.out.println(line.toUpperCase());
        }
    }

}
