package com.tff.exercise.section16;
/*
 * @author 马战川
 * @date 2018/10/15 16:53
 * @description
 */

/**
 * @author 马战川
 * @version 1.0
 * @className E03_TwoDDoubleArray
 * @date 2018/10/15 16:53
 * @description TODO
 */
public class E03_TwoDDoubleArray {
    public static void main(String[] args) {
        printArray(twoDDoubleArray(7, 7, 7.0, 100.0));
    }

    static double[][] twoDDoubleArray(int xLen, int yLen, double valStart, double valEnd) {
        double[][] doubles = new double[xLen][yLen];
        double increment = (valEnd - valStart) / 100;
        double value = valStart;
        for (int i = 0; i < doubles.length; i++) {
            for (int j = 0; j < doubles[i].length; j++) {
                doubles[i][j] = value;
                value += increment;
            }
        }
        return doubles;
    }

    static void printArray(double[][] doubles) {
        for (double[] itemArr : doubles) {
            for (double item : itemArr) {
                System.out.print(item + "\t");
            }
            System.out.println();
        }

    }

}
