package lesson9_dz;

public class Array {
    public static void arrExc(String[][] arr){
        if (arr.length!=4) throw new MyArraySizeException("В массиве больше 4 строк");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[j].length!=4) throw new MyArraySizeException("В массиве больше 4 столбцов");
                try {
                    sum += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw  new MyArrayDataException("ошибка в ячейке " + i + " " + j);

                }

            }

        }
        System.out.println("Сумма массива " + sum);

    }

}
