package lesson7_dz_oop;

public class FeedingTheCat {
    public static void main(String[] args) {
//        Cat barsik = new Cat("Barsik",20);
//        Cat murzik = new Cat("Murzik",50);
        Bowl bowl = new Bowl();
        bowl.putFoodIntoBowl(70);
//        barsik.eat(bowl);
//        murzik.eat(bowl);
//        barsik.isSut(bowl);

        Cat[] cat = {
                new Cat("Barsik",10),
                new Cat("Murzik",15),
                new Cat("Baska",20),
                new Cat("Tishka",30),
                new Cat("Rijik",12),
        };
        for (Cat a :cat) {
            a.eat(bowl);
//            a.isFill(bowl);
        }
        System.out.println("Остаток в миске: "+bowl.getFood());


    }
}
