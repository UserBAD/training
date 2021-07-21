package lesson8_dz_oop;

public class Wall implements Trap {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Barrier participant) {
        if (participant.jump(this.height)) {
            System.out.printf("%s %s преодолел преграду %dm.\n", participant.getClass().getSimpleName(), participant.getName(), height);
            return true;
        }
        System.out.printf("%s %s не смог преодолеть преграду %dm.\n", participant.getClass().getSimpleName(), participant.getName(), height);
        return false;
    }
}
