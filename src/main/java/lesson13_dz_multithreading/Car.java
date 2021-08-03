package lesson13_dz_multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class Car implements Runnable {
    private static ReentrantLock rl = new ReentrantLock();
    private static int winner = 0;
        private static int CARS_COUNT;
        private Race race;
        private int speed;
        private String name;
        public String getName() {
            return name;
        }
        public int getSpeed() {
            return speed;
        }
        public Car(Race race, int speed) {
            this.race = race;
            this.speed = speed;
            CARS_COUNT++;
            this.name = "Участник #" + CARS_COUNT;
        }
        @Override
        public void run() {
//            CyclicBarrier barrier2 = new CyclicBarrier(CARS_COUNT);
            try {
                System.out.println(this.name + " готовится");
                Thread.sleep(500 + (int)(Math.random() * 800));
                System.out.println(this.name + " готов");
//                Thread.sleep(1000);
                Homework.BARRIER.await();
                for (int i = 0; i < race.getStages().size(); i++) {
                    race.getStages().get(i).go(this);
                }
                Winner();
                Homework.BARRIER.await();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        private void Winner(){
            try {
                rl.lock();
                if (winner++==0){
                    System.out.println("Победитель гонки: " + this.name);
                }else System.out.println(this.name + " приехал " + winner);
            }finally {
                rl.unlock();
            }
        }
    }

