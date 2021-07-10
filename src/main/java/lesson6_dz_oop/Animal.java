package lesson6_dz_oop;

public class Animal {
    private String type;
    private String name;
    private int run;
    private int swim;
    public Animal(String type, String name, int run, int swim) {
        this.type = type;
        this.name = name;
        this.run = run;
        this.swim = swim;
    }
    public void run (int barrier){
        if (barrier  <= run) {
            System.out.printf("%s,%s пробежал %d\n", type, name, barrier);
        }else System.out.printf("%s,%s не пробежал %d\n", type, name, barrier);

    }

    public void swim (int barrier){
        if (barrier <= swim) {
            System.out.printf("%s,%s проплыл %d\n", type, name, barrier);
        }else System.out.printf("%s,%s не проплыл %d\n", type, name, barrier);

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public int getSwim() {
        return swim;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }
}
