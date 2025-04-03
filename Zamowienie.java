import java.util.ArrayList;

public class Zamowienie {
    private int id;
    private Klient klient;
    private Produkt[] produkty;
    private int[] ilosci;
    private String dataZamowienia;
    private String status;

    public Zamowienie(){
        this.id = id;
        this.klient = new Klient();
        this.produkty = new Produkt[10];
        this.ilosci = new int[10];
        this.dataZamowienia = "";
        this.status = "";
    }

    public void wyswietlSzczegoly(){
        System.out.println("Id: " + id);
        System.out.println("Klient " + klient);
        System.out.println(produkty);
        System.out.println(ilosci);
        System.out.println(dataZamowienia);
        System.out.println(status);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    public Produkt[] getProdukty() {
        return produkty;
    }

    public void setProdukty(Produkt[] produkty) {
        this.produkty = produkty;
    }

    public int[] getIlosci() {
        return ilosci;
    }

    public void setIlosci(int[] ilosci) {
        this.ilosci = ilosci;
    }

    public String getDataZamowienia() {
        return dataZamowienia;
    }

    public void setDataZamowienia(String dataZamowienia) {
        this.dataZamowienia = dataZamowienia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}