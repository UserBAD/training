package lesson8_dz_oop;

public class Obstacles {
    public static void main(String[] args) {

        Barrier[] barriers = {
                new Robot("Bob",300,10),
                new Cat("Barsik",600,15),
                new Human("Bova",150,12),
        };

        Trap[] traps ={
                new Track( 50),
                new Wall(3),
                new Track( 30),
                new Wall(7),
                new Track( 100),
                new Wall(12),
                new Track( 400),

        };
        for (Barrier p : barriers) {
            for (Trap t : traps) {
                if (!t.overcome(p)) break;
            }
        }
    }
}

