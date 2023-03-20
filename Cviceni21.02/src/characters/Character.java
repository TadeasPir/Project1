package characters;

public abstract class Character {
    protected String jmeno;
    protected int level;
    protected int sila;
    protected int inteligence;
    protected int obratnost;
    protected int odolnost;
    protected int xp;
    protected int zivoty;
    protected Rasa rasa;


    public double getSila(){
        return sila*rasa.bonusSila();
    }
    public double getInteligence(){
        return inteligence*rasa.bonusInteligence();
    }
    public double getObratnost(){
        return obratnost* rasa.bonusObratnost();
    }
    public double getOdolnost(){
        return odolnost * rasa.bonusOdolnost();
    }


    public Character(String jmeno, int level, int sila, int inteligence, int obratnost, int odolnost, int xp) {
        this.jmeno = jmeno;
        this.level = level;
        this.sila = sila;
        this.inteligence = inteligence;
        this.obratnost = obratnost;
        this.odolnost = odolnost;
        this.xp = xp;

    }

    public Character(String jmeno, int sila, int inteligence, int obratnost, int odolnost) {
        this.jmeno = jmeno;
        this.level = 1;
        this.sila = sila;
        this.inteligence = inteligence;
        this.obratnost = obratnost;
        this.odolnost = odolnost;
        this.xp = 0;
    }
    public void setRasa(Rasa rasa){
        this.rasa = rasa;
    }
    public static Character vytvorPostavu(int trida, String jmeno,int sila, int inteligence, int obratnost, int odolnost){
            if (trida ==1) {
                return new Bojovnik(jmeno, 1,  sila,  inteligence,  obratnost,  odolnost,  0);
            }
                if (trida ==2) {
                return new Pruzkumnik(jmeno, 1,  sila,  inteligence,  obratnost,  odolnost,  0);
            }
                if (trida ==3) {
                    return new Mag(jmeno, 1,  sila,  inteligence,  obratnost,  odolnost,  0);
                    }
        return null;
    }

    public abstract double getUtok();
    public double getObrana(Character protivnik){
        return getOdolnost() + protivnik.getVlastnostKObrane(this);
    }

    protected abstract double getVlastnostKObrane(Character obrance);

    public double getRana(Character protivnik){

        return getUtok() - getObrana(protivnik);
        }

    public String getJmeno() {
        return jmeno;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public static String toCSV(Character character){
        return character.getJmeno()+","+ character.getLevel()+","+  character.getSila()+","+  character.getInteligence()+","+  character.getObratnost()+","+  character.getOdolnost()+","+  character.getXp();
    }
}
