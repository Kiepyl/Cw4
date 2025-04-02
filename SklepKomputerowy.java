import java.util.ArrayList;

public class SklepKomputerowy {
    private ArrayList<Produkt> produkty = new ArrayList<>();
    private ArrayList<Klient> klienci = new ArrayList<>();
    private ArrayList<Zamowienie> zamowienia = new ArrayList<>();
    private int liczbaProduktow, liczbaKlientow, liczbaZamowien;

    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }

    public void dodajKlienta(Klient klient){
        klienci.add(klient);
    }

    public void utworzZamowienie(Klient klient, Produkt produkty, int[] ilosc){
        zamowienia.add(new Zamowienie());
        Zamowienie.setKlient(klient);
    }

    public void zastosujZnizke(){

    }
}
