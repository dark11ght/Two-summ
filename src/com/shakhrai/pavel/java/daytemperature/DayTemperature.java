package com.shakhrai.pavel.java.daytemperature;

/**
 * Eсть массив элементов
 * 13, 12, 15, 11, 9, 12, 16
 * n=7
 * числа обозначают температуру в конкретный день
 * для каждого дня нужно найти: сколько суток должно пройти до наступления более тёплого дня
 * 13 - 2
 * 12 - 1
 * 15 - 4
 * 11 - 2
 * 9 - 1
 * 12 - 1
 * 16 - 0
 */
public class DayTemperature {

    public void showDayCount(int[] arr) {

        for (int nowDay = 0; nowDay < arr.length; nowDay++) {
            int count = 0;

            for (int nextDay = nowDay + 1; nextDay < arr.length; nextDay++) {
                count += 1;
                if (arr[nextDay] > arr[nowDay]) {
                    System.out.println(arr[nowDay] + " - " + count);
                    break;
                }
            }

            if (nowDay == arr.length - 1) {
                System.out.println(arr[nowDay] + " - " + 0);
            }

        }
    }
}
