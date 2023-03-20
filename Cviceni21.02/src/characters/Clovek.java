package characters;

public class Clovek implements Rasa{

    @Override
    public double bonusSila() {
        return 1.03;
    }

    @Override
    public double bonusInteligence() {
        return 1.03;
    }

    @Override
    public double bonusObratnost() {
        return 1.04;
    }

    @Override
    public double bonusOdolnost() {
        return 1;
    }

    @Override
    public String getRasa() {
        return "Clovek";
    }
}
