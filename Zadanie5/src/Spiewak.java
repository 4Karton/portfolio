public abstract class Spiewak {

    private String nazwisko;
    private int numerStartowy;
    private static int counter;

    public Spiewak(String nazwisko) {
        this.nazwisko = nazwisko;
        counter++;
        numerStartowy= counter;
    }

    public abstract String spiewaj();

    @Override
    public String toString() {
        return "("+numerStartowy+") " + nazwisko + ": " + spiewaj();
    }

    public static Spiewak najglosniej(Spiewak[] sp) {

        long highest = 0;

        Spiewak temp = null;

        for (Spiewak s : sp) {

            long current = s.spiewaj().toLowerCase().chars().distinct().count();

            if(current > highest){
                highest = current;
                temp = s;
            }

        }
        return temp;
    }
}
