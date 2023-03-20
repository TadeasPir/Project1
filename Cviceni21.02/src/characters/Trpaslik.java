package characters;

public class Trpaslik implements Rasa{

    @Override
    public double bonusSila() {
        return 1.07;
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
        return 1.03;
    }

    @Override
    public String getRasa() {
        return "Trpaslik";
    }
}
