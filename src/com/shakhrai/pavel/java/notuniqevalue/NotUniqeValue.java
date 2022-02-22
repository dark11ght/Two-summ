package com.shakhrai.pavel.java.notuniqevalue;

import java.util.HashSet;
import java.util.Set;

public class NotUniqeValue {

    public void notUniqeValue(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (!set.add(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}