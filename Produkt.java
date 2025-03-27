public class Produkt {
    private int id;
    private String nazwa;
    private String kategoria;
    private double cena;
    private int iloscWMagazynie;

    public Produkt() {
        this.id = id;
        this.nazwa = nazwa;
        this.kategoria = kategoria;
        this.cena = cena;
        this.iloscWMagazynie = iloscWMagazynie;
    }

    public void produktInfo(){
        System.out.println("Produkt ID: " + id);
        System.out.println("Produkt Name: " + nazwa);
        System.out.println("Produkt Category: " + kategoria);
        System.out.println("Produkt Price: " + cena);
        System.out.println("Quantity: " + kategoria);
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setNazwa(String nazwa){
        this.nazwa = nazwa;
    }
    public String getNazwa(){
        return nazwa;
    }

    public void setKategoria(String kategoria){
        this.kategoria = kategoria;
    }
    public String getKategoria(){
        return kategoria;
    }

    public void setCena(double cena){
        this.cena = cena;
    }
    public double getCena(){
        return cena;
    }

    public void setIloscWMagazynie(int iloscWMagazynie){
        this.iloscWMagazynie = iloscWMagazynie;
    }
    public int getIloscWMagazynie(){
        return iloscWMagazynie;
    }
}
