package characters;

public class Pruzkumnik extends Character {
    public Pruzkumnik(String jmeno, int level, int sila, int inteligence, int obratnost, int odolnost, int xp) {
        super(jmeno, level, sila, inteligence, obratnost, odolnost, xp);
    }
    public double getUtok(){
        return 3* getObratnost();
    }
    public double getVlastnostKObrane(Character obrance){
        return obrance.getObratnost();
    }
}
