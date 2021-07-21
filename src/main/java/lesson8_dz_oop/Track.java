package lesson8_dz_oop;

public class Track implements Trap {
    private int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Barrier participant) {
        if (participant.running(this.length)) {
            System.out.printf("%s %s пробежал %dm.\n", participant.getClass().getSimpleName(), participant.getName(), length);
            return true;
        }
        System.out.printf("%s %s не смог пробежать %dm.\n", participant.getClass().getSimpleName(), participant.getName(), length);
        return false;
    }
}
