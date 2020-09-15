import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Taksowka extends Samochod {

    protected LocalDate dataTaksometru;
    protected String dataTaksometruString;

    public Taksowka (){

    }

    public Taksowka(String marka, String model,
                    int rokProdukcji, String dataRejestracjiString,
                    String dataPrzegląduString, String dataUbezpieczeniaString) {
        super(marka, model, rokProdukcji, dataRejestracjiString, dataPrzegląduString, dataUbezpieczeniaString);
        this.dataTaksometru = LocalDate.of(0001,01,01);
        System.out.println("Proszę wypełnić datę taksometru");
    }
    public Taksowka(String marka, String model,
                    int rokProdukcji, String dataRejestracjiString,
                    String dataPrzegląduString, String dataUbezpieczeniaString, String dataTaksometruString) {
        super(marka, model, rokProdukcji, dataRejestracjiString, dataPrzegląduString, dataUbezpieczeniaString);
        this.dataTaksometru = LocalDate.parse(dataTaksometruString);
        System.out.println("Taksówka została pomyślnie zarejestrowana.");
    }

    public void setDataTaksometru(int year, int month, int dayOfMonth) {
        this.dataTaksometru = LocalDate.of(year, month, dayOfMonth);

        System.out.println("Data taksometru " + this.dataTaksometru);
    }

    public boolean waznoscTaksometru() {
        long dniPomiedzy;
        if ((dniPomiedzy = DAYS.between(dataTaksometru, dzisiaj)) <= 180) {
            System.out.println("Taksometr jest ważny.");
            return true;
        }else{
            System.out.println("Taksometr jest nieważny");
            return false;
        }
    }

    public String toString() {

        System.out.println("Pojazd{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", dataRejestracji=" + dataRejestracji +
                ", dataPrzegladu=" + dataPrzegladu +
                ", dataUbezpieczenia=" + dataUbezpieczenia +
                ", dataTaksometru=" + dataTaksometru +
                '}');
        return "";
    }
}
