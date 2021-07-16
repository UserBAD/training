package lesson6_dz_oop;

public class Cat extends Animal{
    public Cat (String name,int run,int swim){
        super ("Cat",name,run,swim);
    }
   @Override
   public void swim (int barrier){
      System.out.println( getType() +" "+ getName() + " Кошки не плавают ! ");
   }

}
