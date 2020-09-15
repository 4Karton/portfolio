public class Skrzypek extends Muzyk {
    public Skrzypek(String name, double timeOnStage) {
        super(name,timeOnStage);
    }

    @Override
    public String instrument() {
        return "skrzypce";
    }

    @Override
    public double moneyPerHour() {
        return 200.0;
    }
}
