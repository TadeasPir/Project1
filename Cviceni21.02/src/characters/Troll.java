package characters;

public class Troll implements Rasa {

    @Override
    public double bonusSila() {
        return 1.1;
    }

    @Override
    public double bonusInteligence() {
        return 1;
    }

    @Override
    public double bonusObratnost() {
        return 1;
    }

    @Override
    public double bonusOdolnost() {
        return 1;
    }

    @Override
    public String getRasa() {
        return "Troll";
    }
}
