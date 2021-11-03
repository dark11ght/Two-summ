package com.shakhrai.pavel.java;

import com.shakhrai.pavel.java.twosumm.TwoSumm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 16, 9, 11, 5};
        int target = 14;

        TwoSumm twoSumm = new TwoSumm();

        System.out.println(Arrays.toString(twoSumm.twoSum(arr, target)));

    }
}
