package com.tff.exercise.section20;
/*
 * @author 马战川
 * @date 2018/12/18 19:31
 * @description
 */

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author 马战川
 * @version 1.0
 * @className UseCaseTracker
 * @date 2018/12/18 19:31
 * @description TODO
 */
public class UseCaseTracker {
    public static void trackUseCases(List<Integer> useCases, Class<?> clazz) {
        if (useCases == null) {
            return;
        }
        for (Method method : clazz.getDeclaredMethods()) {
            UseCase useCase = method.getAnnotation(UseCase.class);
            if (useCase != null) {
                System.out.println("Found Use Case:" + useCase.id() + " " + useCase.description());
                useCases.remove(new Integer(useCase.id()));
            }
        }
        for (int id : useCases) {
            System.out.println("Warning: Missing use case-" + id);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<>();
        Collections.addAll(useCases, 47, 48, 49, 50);
        trackUseCases(useCases, PasswordUtils.class);
    }
}
