public abstract class Muzyk {

    protected String name;
    protected double timeOnStage;

    public Muzyk(String name, double timeOnStage) {
        this.name = name;
        this.timeOnStage = timeOnStage;
    }

    public abstract String instrument();
    public abstract double moneyPerHour();

    @Override
    public String toString() {
        return name + ", czas = " +
                + timeOnStage +
                " godz., stawka = " +
                moneyPerHour();
    }

    public static Muzyk maxHonorarium(Muzyk[] array) {
        double maxValue = array[0].moneyPerHour() * array[0].timeOnStage;
        Muzyk muzyk = array[0];
        for(Muzyk m : array) {
            if (maxValue < m.moneyPerHour() * m.timeOnStage) {
                maxValue = m.moneyPerHour();
                muzyk = m;
            }
        }
        return muzyk;
    }

}
