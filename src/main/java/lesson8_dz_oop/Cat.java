package lesson8_dz_oop;

public class Cat implements Barrier{
    private String name;
    private String type;
    private int maxRun;
    private int maxJump;

    public Cat (String name, int maxRun, int maxJump){
        this.name=name;
        this.type="Cat";
        this.maxRun=maxRun;
        this.maxJump=maxJump;
    }
    @Override
    public boolean running(int length) {
        return this.maxRun>=length;
    }

    @Override
    public boolean jump(int volume) {
        return this.maxJump>=volume;
    }
    @Override
    public String getName(){
        return this.name;
    }

}
