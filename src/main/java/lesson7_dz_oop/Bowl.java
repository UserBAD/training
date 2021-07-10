package lesson7_dz_oop;

public class Bowl {
    private int food;

    public void putFoodIntoBowl(int amount){
        this.food += amount;
        System.out.printf("Food increased for %d, now: %d\n", amount,this.food);
    }
    public void decreaseFoodFromBowl(int amount){
        if (amount <= this.food) {
            this.food -= amount;
//            System.out.printf("Food decreased for %d, now: %d\n", amount, this.food);
        }else System.out.println("Миска пуста");
    }

    public int getFood() {
        return food;
    }


}
