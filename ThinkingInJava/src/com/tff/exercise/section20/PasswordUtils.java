package com.tff.exercise.section20;
/*
 * @author 马战川
 * @date 2018/12/18 19:20
 * @description
 */

import java.util.List;

/**
 * @author 马战川
 * @version 1.0
 * @className PasswordUtils
 * @date 2018/12/18 19:20
 * @description TODO
 */
public class PasswordUtils {

    @UseCase(id = 47, description = "Passwords must contain at least one numeric")
    public boolean validatePassword(String password) {
        return password.matches("\\w*\\d\\w*");
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49,description = "New passwords can't equal previously used ones")
    public boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
