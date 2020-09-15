public class Flecista extends Muzyk {

    public Flecista(String name, double timeOnStage) {
        super(name,timeOnStage);
    }

    @Override
    public String instrument() {
        return "flet";
    }

    @Override
    public double moneyPerHour() {
        return 300.0;
    }

}
