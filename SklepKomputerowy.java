import java.util.ArrayList;

public class SklepKomputerowy {
    private ArrayList<Produkt> produkty;
    private ArrayList<Klient> klienci = new ArrayList<>();
    private ArrayList<Zamowienie> zamowienia = new ArrayList<>();
    private int liczbaProduktow, liczbaKlientow, liczbaZamowien;

    public void dodajProdukt(Produkt produkt){
        produkty.add(produkt);
    }

    public void dodajKlienta(Klient klient){
        klienci.add(klient);
    }

    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produkty, int[] ilosci){
        var zam = new Zamowienie();
        zam.setKlient(klient);
        zam.setProdukty(produkty);
        zam.setIilosci(ilosci);
        zamowienia.add(zam);
        return zam;
    }

    public void zastosujZnizke(){

    }
}
