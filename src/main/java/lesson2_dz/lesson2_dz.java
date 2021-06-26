package lesson2_dz;

import java.util.Arrays;

public class lesson2_dz {
    public static void main(String[] args) {
//          exercise1();
//          exercise2();
//          exercise3();
//          exercise4();
//          exercise5();


    }

    //Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    private static void exercise1() {
        int[] arr = {0, 1, 1, 0, 0, 1, 0, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.print(arr[i] = 1);
            } else
                System.out.print(arr[i] = 0);
        }
    }

    //Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void exercise2() {
        int[] arr = new int[8];
        arr[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 3;
            System.out.print(arr[i] +" ");
        }
    }

    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void exercise3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                System.out.print(arr[i] * 2 +" ");
            } else
                System.out.print(arr[i] +" ");
        }
    }

    // Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    private static void exercise4() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
            arr[i][i] = 1;
            arr[i][arr.length -1 - i] =1;
                System.out.print(arr[i][j] + " " );
            }
                System.out.println();
        }
    }
    //Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    private static void exercise5() {
        int[] arr = {0, 26, 4, -2, 10, 4, 14, 30};
        int min = arr[0];
        int max = arr[0];
        System.out.print(Arrays.toString(arr));
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }
        System.out.println(" Min :" + min + " Max :" + max);
    }
    //Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
//    static boolean exercise6() {
//        int[] arr = {2, 4, 2, 2, 6, 2};
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
//        if (sum % 2 !=0) return false;
//            sum /= 2;
//            int half = 0;
//            for (int i = 0; i < arr.length; i++) {
//            half += arr[i];
//            if (half==sum) return true; //System.out.println(true)
//
//        }
//
//    }
}


