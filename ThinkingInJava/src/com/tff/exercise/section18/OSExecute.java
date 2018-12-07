package com.tff.exercise.section18;
/*
 * @author 马战川
 * @date 2018/11/26 16:14
 * @description
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 马战川
 * @version 1.0
 * @className OSExecute
 * @date 2018/11/26 16:14
 * @description TODO
 */
public class OSExecute {
    public static void command(String command) {
        boolean err = false;
        try {
            Process process = new ProcessBuilder(command.split(" ")).start();
            BufferedReader results = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String s;
            while ((s = results.readLine()) != null) {
                System.out.println(s);
            }
            BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()));
            while ((s = errors.readLine()) != null) {
                System.out.println(s);
                err = true;
            }
        } catch (IOException e) {
            if (!command.startsWith("CMD /C"))
                command("CMD /C" + command);
            else
                throw new RuntimeException(e);
        }
        if (err) {
            throw new OSExecuteException("Errors executing " + command);
        }
    }

}


