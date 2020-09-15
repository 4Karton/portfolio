import java.time.LocalDate;

public class  Pojazd {
    protected String marka;
    protected String model;
    protected int rokProdukcji;
    protected String dataRejestracjiString;
    protected LocalDate dataRejestracji;


    public Pojazd(){

    }

    public Pojazd(String marka, String model, int rokProdukcji) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.dataRejestracji = LocalDate.of(0001, 01, 01);
        System.out.println("Pojazd "+marka+", "+model+", "+rokProdukcji +" Został zarejestrowany, brak uzupełnionej daty rejestracji");
    }

    public Pojazd(String marka, String model, int rokProdukcji, String dataRejestracjiString) {
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
        this.dataRejestracji = LocalDate.parse(dataRejestracjiString);


        System.out.println("Samochód "+marka +", "+ model + ", "+ rokProdukcji+", "+dataRejestracji+ " został wpisany do systemu." );
    }

    public void setDataRejestracji(int year, int month, int dayOfMonth) {
        this.dataRejestracji = LocalDate.of(year, month, dayOfMonth);
    }

    @Override
    public String toString() {

        System.out.println("Pojazd{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", rokProdukcji=" + rokProdukcji +
                ", dataRejestracji=" + dataRejestracji +
                '}');
        return"";
    }
}
