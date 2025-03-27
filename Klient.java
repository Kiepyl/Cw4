public class Klient {
    private int id;
    private String name;
    private String surname;
    private String email;
    private boolean regularClient;

    public Klient() {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.regularClient = regularClient;
    }

    public void klientInfo(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Email: " + email);
        System.out.println("Regular Client: " + regularClient);
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }
    public String getSurname(){
        return surname;
    }

    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }

    public void setRegularClient(boolean regularClient){
        this.regularClient = regularClient;
    }
    public boolean getRegularClient(){
        return regularClient;
    }
}
