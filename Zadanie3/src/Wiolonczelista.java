public class Wiolonczelista extends Muzyk{

    public Wiolonczelista(String name, double timeOnStage) {
        super(name,timeOnStage);
    }

    @Override
    public String instrument() {
        return "wiolonczela";
    }
    @Override
    public double moneyPerHour() {
        return 250.0;
    }
}
