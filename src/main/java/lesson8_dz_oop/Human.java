package lesson8_dz_oop;

public class Human implements Barrier{
    private int maxRun;
    private int maxJump;
    private String name;

    public Human (String name, int maxRun, int maxJump){
        this.name=name;
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
