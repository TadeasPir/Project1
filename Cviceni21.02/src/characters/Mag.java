package characters;

public class Mag extends Character{

    public Mag(String jmeno, int level, int sila, int inteligence, int obratnost, int odolnost, int xp) {
        super(jmeno, level, sila, inteligence, obratnost, odolnost, xp);
    }

    @Override
    public double getUtok() {
        return 3* getInteligence();
    }

    @Override
    protected double getVlastnostKObrane(Character obrance) {
        return obrance.getInteligence();
    }
}
