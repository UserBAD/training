package lesson14_dz_testing;

import java.util.Arrays;

public class Homework14 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrAfter4 (new int[]{9,8,7,6,5,4,3,2,1,0})));
        //System.out.println(Arrays.toString(arrAfter4 (new int[]{9,8,7,6,5,3,3,2,1,0})));
        System.out.println(arr14(new int[]{1,1,1,4,4,1,4,4}));
        System.out.println(arr14(new int[]{1,1,1}));
        System.out.println(arr14(new int[]{1,1,4,5,1,1}));




    }

    public static int[] arrAfter4 (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==4) return Arrays.copyOfRange(arr,i+1,arr.length);
        }
        throw new RuntimeException("В массиве нет цифры 4");
    }

    public static boolean arr14 (int[] arr){
        boolean one = false;
        boolean four = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] ==1) one = true;
            else if (arr[i] == 4) four = true;
            else return false;
        }
        return one && four;
    }
}
