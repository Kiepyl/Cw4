public class Klient {
    private int id;
    private String imie;
    private String nazwisko;
    private String email;
    private boolean czyStaly;

    public Klient() {
    }

    public void klientInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + imie);
        System.out.println("Surname: " + nazwisko);
        System.out.println("Email: " + email);
        System.out.println("Regular Client: " + czyStaly);
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setImie(String imie){
        this.imie = imie;
    }
    public String getName(){
        return imie;
    }

    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }
    public String getNazwisko(){
        return nazwisko;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setCzyStaly(boolean czyStaly){
        this.czyStaly = czyStaly;
    }
    public boolean getczyStaly(){
        return czyStaly;
    }
}
