package gestionnaire;

public class Utilisateur {

    private int id;
    private String nom;
    private String address;


    public Utilisateur(int id, String nom, String address) {
        this.id = id;
        this.nom = nom;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
