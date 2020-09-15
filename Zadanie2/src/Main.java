import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {


        Pojazd nowyPojazd1 = new Pojazd("Nissan","Super Szybki", 2004,"2014-01-30" );
        nowyPojazd1.toString();
        System.out.println("setDataRejestracji");
        nowyPojazd1.setDataRejestracji(2004,01,12);
        nowyPojazd1.toString();

        Samochod nowySamochod1 = new Samochod("Wolvo", "Exclusive", 2012, "2012-04-04", "2020-06-03","2020-04-09");
        nowySamochod1.toString();
        nowySamochod1.setDataRejestracji(2010,03,01);
        nowySamochod1.setDataUbezpieczenia(2020,01,31);
        nowySamochod1.setDataPrzegladu(2019,10,10);
        nowySamochod1.toString();

        System.out.println("");

        nowySamochod1.waznoscPrzegladu();
        nowySamochod1.waznoscUbezpieczenia();

        Taksowka nowaTaksowka1 = new Taksowka("Nowa","TaksówkajakaśTestowa",2021,"2020-01-10","2020-01-01","1010-10-10","2019-12-07");
        nowaTaksowka1.toString();

        nowaTaksowka1.waznoscTaksometru();




//        Samochod nowy = new Samochod("Nissan", "Jeszcze Szybszy X2", 2021);
//        nowy.setDataRejestracji(1993,3,12);
//        nowy.setDataPrzegladu(1997, 1, 12);
//        nowy.setDataUbezpieczenia(2019, 5, 1);
//
//        //Samochod nowy1 = new Samochod("Nissan", "Nowy", 1997, );
//        nowy.waznoscUbezpieczenia();
//        Taksowka newestOne = new Taksowka();
//        newestOne.setDataTaksometru(2020,1,1);
//        newestOne.waznoscTaksometru();


    }
}
