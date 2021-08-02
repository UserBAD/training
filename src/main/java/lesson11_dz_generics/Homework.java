package lesson11_dz_generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework {
    public static void main(String[] args) {
        String[] words = {"apple", "orange"};
        replacement(words);
        System.out.println(Arrays.toString(words));
        replacement(words);  // вернул массив к исходному значению
        for (String s : arrayList(words)){
            System.out.println(s);
        }
//        System.out.println(arrayList(words));

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();

        Box <Apple> boxApple = new Box<Apple>(apple1,apple2,apple3,apple4);
        Box <Orange> boxOrange = new Box<Orange>(orange1,orange2,orange3);
        System.out.println(boxApple.getWeight());
        System.out.println(boxOrange.getWeight());
        System.out.println(boxApple.compare(boxOrange));

//        Box <Orange> boxOrange2 = new Box<Orange>(orange1,orange2);
//        Box <Apple> boxApple2 = new Box<Apple>(apple1,apple2,apple3);
//
//        System.out.println(boxApple2.compare(boxOrange2));


        }
        public static void replacement (String[] arr) {
        String temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        }

        public static <T> ArrayList <T> arrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));

        }
}
