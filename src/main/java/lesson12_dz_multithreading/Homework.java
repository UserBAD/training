package lesson12_dz_multithreading;

import java.util.Arrays;

public class Homework {

    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;


    public static void main(String[] args) {
        Homework homework = new Homework();
        homework.arr1();
//        homework.arr2();
        Homework homework1 =new Homework();
        Thread arr22 = new Thread(homework1::arr2);
        arr22.start();
        try{
            arr22.join();
               } catch (InterruptedException e){
            e.printStackTrace();
        }

    }
        public void arr1(){
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1f);
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println(System.currentTimeMillis() - a);
        System.out.println();
        System.out.print(arr[0]);
        System.out.println();
        System.out.print(arr[4999999]);
        System.out.println();
        System.out.print(arr[9999999]);
        System.out.println();

        System.out.printf("Поток [%s]\n", Thread.currentThread().getName());
    }

    public void arr2() {
        float[] arr2 = new float[SIZE];
        float[] a1 = new float[HALF];
        float[] a2 = new float[HALF];

        Arrays.fill(arr2, 1f);
        long b = System.currentTimeMillis();


        System.arraycopy(arr2, 0, a1, 0, HALF);
        System.arraycopy(arr2, HALF, a2, 0, HALF);

//        Homework homework1 =new Homework();
//        Homework homework2 =new Homework();

//        Thread potok1 = new Thread(homework1::compute(a1));
//        Thread potok2 = new Thread(homework2::compute(a2));

        Thread potok1 = new Thread(() -> compute(a1) );
        Thread potok2 = new Thread(() -> compute(a2) );

        potok1.start();
        potok2.start();

        try{
            potok1.join();
            potok2.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.arraycopy(a1, 0, arr2, 0, HALF);
        System.arraycopy(a2, 0, arr2, HALF, HALF);

        System.out.println();
        System.out.println(System.currentTimeMillis() - b);
        System.out.println();
        System.out.print(arr2[0]);
        System.out.println();
        System.out.print(arr2[4999999]);
        System.out.println();
        System.out.print(arr2[5000000]);
        System.out.println();
        System.out.print(arr2[9999999]);
        System.out.println();
        System.out.printf("Поток [%s]\n", Thread.currentThread().getName());

//        if(Arrays.equals(arr,arr2)){
//            System.out.println("массивы равны");
//        }else System.out.println("массивы не равны");

    }

    static synchronized void compute (float[] arr) {
//        Arrays.fill(arr, 1f);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
//            System.out.printf("Поток [%s]\n", Thread.currentThread().getName());
        }
    }

}
