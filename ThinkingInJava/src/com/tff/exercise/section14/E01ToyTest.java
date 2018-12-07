package com.tff.exercise.section14;
/*
 * @author 马战川
 * @date 2018/9/29 15:48
 * @description
 */

/**
 * @author 马战川
 * @version 1.0
 * @className E01ToyTest
 * @date 2018/9/29 15:48
 * @description TODO
 */

interface HasBatteries {
}

interface Waterproof {
}

interface Shoots {
}

class Toy {
    /*Toy() {
    }*/
    Toy(int i) {
    }
}

class FancyToy extends Toy implements HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class E01ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name:" + cc.getSimpleName());
    }


    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("com.tff.exercise.section14.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can not find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up  = c.getSuperclass();
        
        printInfo(up);
    }

}





