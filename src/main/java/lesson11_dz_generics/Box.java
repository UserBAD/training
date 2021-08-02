package lesson11_dz_generics;

import java.util.ArrayList;
import java.util.Arrays;

public class Box <N extends Fruit>  {
    private ArrayList<N> fruit;

    public Box(N... fruit){
        this.fruit= new ArrayList<N> (Arrays.asList(fruit));
    }
    public float getWeight (){
        float sum = 0;
        for (N fruit : fruit ){
            sum += fruit.getWeight();
        }
        return sum;
    }
//    public void compare (Box fruits){
//        float bool;
//        bool = ((Float)this.getWeight() - (Float) fruits.getWeight());
//        if (bool==0) {System.out.println(true);
//        }else System.out.println(false);
//
//    }
    public boolean compare (Box fruits){   //идея долга не давала сделать через boolean все хотела черех void, потом поня, поменял на float
        return this.getWeight() == fruits.getWeight();
    }





}
