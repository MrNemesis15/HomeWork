package homework;

import java.util.Arrays;
import java.util.Random;

public class HomeWork3 {

    //    //    Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println (Arrays.toString (arr));
    }

    //
//    //    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println (Arrays.toString (arr));
    }

    ////    Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
////    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
////    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
//
//
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                if (j + i == arr.length - 1) {
                    arr[i][j] = 1;
                }
                System.out.printf (arr[i][j] + " ");
            }
            System.out.println ();
        }
    }


    //    Написать метод, принимающий на вход два аргумента: len и initialValue,
//////    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static void oneArr(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.printf (arr[i] + " ");
        }
        System.out.println ();
    }

    ////* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void minMaxArr() {
        Random random = new Random ();
//        int[] intArr = new int[5];
        int[] intArr = {6, 7, 2, 9, 3, 5};
        int max = intArr[0];
        int min = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
//            intArr[i] = random.nextInt (50);

            if (intArr[i] > max) {
                max = intArr[i];
            }
            if (intArr[i] < min) {
                min = intArr[i];
            }
        }
        System.out.println (min + " Минимальное");
        System.out.println (max + " Максимальное");
    }

    ///** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
////            Примеры:
////    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
////    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
////    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.

    public static boolean checkBalance(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 != 0) {
            return false;
        }
        int sumLeft = 0;
        int i = 0;
        while (sumLeft < sum / 2) {
            sumLeft += array[i];
            i++;
        }
        return sumLeft == sum / 2;
    }
//        int rightSum = 0;
//        int leftSum = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            rightSum += array[i];
//        }
//        for (int i = 0; i < array.length; i++) {
//            leftSum += array[i];
//        }
//        if (leftSum == rightSum-leftSum) {
//            return true;
//        }
//        return false;
//    }

    ////
////*** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
// при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
// Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
// при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    public static int[] shiftArr(int[] arr, int n) {
        int k = n % arr.length + arr.length;
        for (int i = 0; i < k; i++) {
            int tmp = arr[arr.length - 1];
            for (int j = arr.length-1; j > 0 ;
            j--){
                arr[j] = arr[j - 1];

            }
            arr[0] = tmp;
        } return arr;
    }
}


