package com.tff.exercise.section20;
/*
 * @author 马战川
 * @date 2018/12/18 19:18
 * @description
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author 马战川
 * @version 1.0
 * @className UseCase
 * @date 2018/12/18 19:18
 * @description TODO
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface UseCase {
    public int id();

    public String description() default "no description";
}
