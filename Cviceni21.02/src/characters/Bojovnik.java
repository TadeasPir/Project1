package characters;

public class Bojovnik extends Character{
    public Bojovnik(String jmeno, int level, int sila, int inteligence, int obratnost, int odolnost, int xp) {
        super(jmeno, level, sila, inteligence, obratnost, odolnost, xp);
    }
    public double getUtok(){
        return 3* getSila();
    }

    public double getVlastnostKObrane(Character obrance){
        return obrance.getSila();
    }
}