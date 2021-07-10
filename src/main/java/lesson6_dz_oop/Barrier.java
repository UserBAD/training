package lesson6_dz_oop;

public class Barrier {
    public static void main (String[] args){
       Animal[] animals = {
               new Cat("Кот1", 200,0),
               new Dog("Собака1",500,10),
               new Cat("Кот2", 100,0),
               new Dog("Собака2",300,30),

       } ;
        for (Animal a :animals){
            a.run(100);
            a.swim( 7);
            a.run(400);
            a.swim(15);
        }
    }

}
