package com.tff.exercise.section16;
/*
 * @author 马战川
 * @date 2018/10/15 15:46
 * @description
 */

import com.sun.jndi.ldap.Ber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 马战川
 * @version 1.0
 * @className P433_ContainerComparison
 * @date 2018/10/15 15:46
 * @description TODO
 */
public class P433_ContainerComparison {
    public static void main(String[] args) {
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[5];
        for (int i = 0; i < 5; i++) {
            berylliumSpheres[i] = new BerylliumSphere();
        }
        System.out.println(Arrays.toString(berylliumSpheres));
        List<BerylliumSphere> berylliumSphereArrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            berylliumSphereArrayList.add(new BerylliumSphere());
        }
        System.out.println(berylliumSphereArrayList);
    }

    /**
     * 创建数组
     * 
     * @param size 数组大小
     * @return com.tff.exercise.section16.BerylliumSphere[]
     * @date 2018/10/15 16:51
     * @author 马战川
     **/
    public static BerylliumSphere[] createBerylliumSphereArray(int size){
        BerylliumSphere[] berylliumSpheres = new BerylliumSphere[size];
        for (int i = 0; i < berylliumSpheres.length; i++) {
            berylliumSpheres[i] = new BerylliumSphere();
        }
        return berylliumSpheres;
    }

}

class BerylliumSphere {
    private static long counter;
    private long id;

    BerylliumSphere(){
        synchronized (BerylliumSphere.class){
            this.id = counter++;
        }
    }
    public String toString() {
        return "Sphere" + id;
    }
}
