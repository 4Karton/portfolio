import java.sql.SQLOutput;

public class ReverseTest {

    public static void main(String[] args) {

        Reversible[] revers = new Reversible[] {
                new ReversibleString("Kot2020"),
                new ReversibleInt(2),
                new ReversibleInt(3),
                new ReversibleString("Pies"),
                new ReversibleString("Ala ma kota i psa"),
                new ReversibleInt(10)
        };

        System.out.println("Normalne:");
        for (Reversible r : revers) {
            System.out.println(r);
        }

        for (Reversible r : revers) {
            r.reverse();
        }

        System.out.println("Odwrócone:");
        for (Reversible r : revers) {
            System.out.println(r);
        }

        System.out.println("Przywrócone i zmienione:");
        for (Reversible r : revers) {
            r.reverse();
            if(r instanceof ReversibleInt)
                System.out.println(Integer.parseInt(r.toString()) + 10);
            else if(r instanceof ReversibleString)
                System.out.println("Tekst " + r);
        }
    }
}