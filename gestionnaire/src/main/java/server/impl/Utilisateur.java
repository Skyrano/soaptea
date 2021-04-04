package server.impl;

public class Utilisateur {

    private final int id;
    private String nom;
    private String address;
    private String mdp;


    public Utilisateur(int id, String nom, String address, String mdp) {
        this.id = id;
        this.nom = nom;
        this.address = address;
        this.mdp = mdp;
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

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

}
