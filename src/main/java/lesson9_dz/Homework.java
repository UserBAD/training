package lesson9_dz;

import com.sun.glass.ui.Size;

public class Homework {
    public static void main(String[] args) {
        String[][] arrSize=new String[][]{
                {"1","2","3","4","5"},
                {"2","1","2","3"},
                {"3","4","5","6"},
                {"4","5","6","7"},
        };
        System.out.println("Тест 1 размера массива");
        try {
            Array.arrExc(arrSize);
        }catch (MyArraySizeException e){
            System.out.println("Массив>4");
            e.printStackTrace();
        }

        String[][] arrSize2=new String[][]{
                {"1","2","3","4"},
                {"2","1","2","3"},
                {"3","4","5","6"},
                {"4","5","6","7"},
                {"5","6","7","8"},
        };
        System.out.println("Тест 2 размера массива");
        try {
            Array.arrExc(arrSize2);
        }catch (MyArraySizeException e){
            System.out.println("Массив>4");
            e.printStackTrace();
        }

        String[][] arrSum=new String[][]{
                {"1","2","3","4"},
                {"2","1","2","3"},
                {"3","4","5","6"},
                {"4","5","err","7"},

        };
        System.out.println("Тест 3 Проверка на текст в массиве");
        try {
            Array.arrExc(arrSum);
        }catch (MyArrayDataException e){
            System.out.println("В массиве есть текст");
            e.printStackTrace();

        }
        String[][] arrSum2=new String[][]{
                {"1","2","3","4"},
                {"2","1","2","3"},
                {"3","4","5","6"},
                {"4","5","6","7"},

        };
        System.out.println("Тест 4 Сумма");
//        try {
            Array.arrExc(arrSum2);
//        }catch (MyArrayDataException e){
//            System.out.println("В массиве есть текст");
//            e.printStackTrace();

//        }



    }

}
