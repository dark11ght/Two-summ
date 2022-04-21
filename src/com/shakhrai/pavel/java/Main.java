package com.shakhrai.pavel.java;

import com.shakhrai.pavel.java.daytemperature.DayTemperature;
import com.shakhrai.pavel.java.notuniqevalue.NotUniqeValue;
import com.shakhrai.pavel.java.twosumm.TwoSumm;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {2, 16, 9, 11, 5};
        int target = 14;
        int[] arr2 = {1, 2, 3, 4, 3};
        int[] arr3 = {13, 12, 15, 11, 9, 12, 16};

        TwoSumm twoSumm = new TwoSumm();
        System.out.println(Arrays.toString(twoSumm.twoSum(arr, target)));

        NotUniqeValue notUniqeValue = new NotUniqeValue();
        notUniqeValue.notUniqeValue(arr2);

        DayTemperature dayTemperature= new DayTemperature();
        dayTemperature.showDayCount(arr3);

    }
}
