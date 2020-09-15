import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;

public class Samochod extends Pojazd {

    protected LocalDate dataPrzegladu;
    protected String dataPrzegladuString;
    protected LocalDate dataUbezpieczenia;
    protected String databezpieczeniaString;
    protected LocalDate dzisiaj = LocalDate.now();


    public Samochod(){}

    public Samochod (String marka, String model,
                     int rokProdukcji){
        super(marka, model, rokProdukcji);
        this.dataRejestracji=LocalDate.of(0001, 01, 01);
        this.dataPrzegladu=LocalDate.of(0001, 01, 01);
        this.dataUbezpieczenia=LocalDate.of(0001, 01, 01);
        System.out.println("Proszę uzupełnić datę rejestracji, przeglądu oraz ubezpieczenia");

    }
    public Samochod (String marka, String model,
                     int rokProdukcji, String dataRejestracjiString){
        super(marka, model, rokProdukcji, dataRejestracjiString);
        this.dataRejestracji=LocalDate.parse(dataRejestracjiString);
        this.dataPrzegladu=LocalDate.of(0001, 01, 01);
        this.dataUbezpieczenia=LocalDate.of(0001, 01, 01);
        System.out.println("Proszę uzupełnić datę przeglądu oraz ubezpieczenia");

    }


    public Samochod (String marka, String model,
                     int rokProdukcji, String dataRejestracjiString, String dataPrzegląduString, String dataUbezpieczeniaString) {
        super(marka, model, rokProdukcji, dataRejestracjiString);
        this.dataPrzegladu = LocalDate.parse(dataPrzegląduString);
        this.dataUbezpieczenia = LocalDate.parse(dataUbezpieczeniaString);
        System.out.println("Samochód został pomyślnie zarejestrowany.");
    }



    public void setDataPrzegladu(int year, int month, int dayOfMonth) {
        this.dataPrzegladu = LocalDate.of(year, month, dayOfMonth);

        System.out.println("Data przeglądu " + this.dataPrzegladu);
    }

    public void setDataUbezpieczenia(int year, int month, int dayOfMonth) {
        this.dataUbezpieczenia = LocalDate.of(year, month, dayOfMonth);

        System.out.println("Data ubezpieczenia " + this.dataUbezpieczenia);
    }

    public boolean waznoscPrzegladu() {
        long dniPomiedzy;
        if ((dniPomiedzy = DAYS.between(dataPrzegladu, dzisiaj)) <= 365) {
            System.out.println("Przegląd jest ważny.");
            return true;
        }else{
            System.out.println("Przegląd jest nieważny.");
            return false;
        }
    }
    public boolean waznoscUbezpieczenia() {
        long dniPomiedzy;
        if ((dniPomiedzy = DAYS.between(dataUbezpieczenia, dzisiaj)) <= 365) {
            System.out.println("Ubezpieczenie jest ważne.");
            return true;
        }else{
            System.out.println("Ubezpieczenie jest nieważne");
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
                '}');
        return"";
    }

}
