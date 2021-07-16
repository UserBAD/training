package lesson7_dz_oop;

public class Cat {
    private String name;
    private int appetite;
    private int noFood;
    private boolean fill;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.noFood=noFood;
        this.fill = true;
    }

    public void eat(Bowl bowl){
        if (appetite <= bowl.getFood()){
        bowl.decreaseFoodFromBowl(appetite);
        System.out.printf("Кот %s поел %d. %s сытый ? %b \n", this.name,this.appetite,this.name,isFill(bowl));
//            System.out.println( this.name+" поел? "+ isFill(bowl));

        }else {noFood =appetite-bowl.getFood();
        System.out.printf("Аппетит Кота %s  %d, в миске недостаточно %d. %s сытый ? %b\n", this.name,this.appetite,this.noFood,this.name,isFill(bowl));
//            System.out.println( this.name+" поел? "+ isFill(bowl));
        }

    }
    public boolean isFill (Bowl bowl){
        return
                this.appetite <= bowl.getFood() ;
    }



    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
