package server.impl;

import java.util.HashMap;

public class Commande {

    private final int id;
    private final int idUtilisateur;
    private HashMap<String, Integer> listeThe;
    private String etat;

    public Commande(int id, int idUtilisateur, HashMap<String, Integer> listeThe, String etat) {
        this.id = id;
        this.idUtilisateur = idUtilisateur;
        this.listeThe = listeThe;
        this.etat = etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getEtat() {
        return  this.etat;
    }

    public void ajouterThe(String nomThe, int nombre) {
        if (nombre > 0) {
            if (!listeThe.containsKey(nomThe)) {
                listeThe.put(nomThe, nombre);
            }
            else {
                listeThe.replace(nomThe, listeThe.get(nomThe) + nombre);
            }
        }
    }

    public void supprimerThe(String nomThe, int nombre) {
        if (listeThe.containsKey(nomThe)) {
            if (listeThe.containsKey(nomThe) && nombre >= 0) {
                listeThe.replace(nomThe, listeThe.get(nomThe) - nombre);
                if (listeThe.get(nomThe) <= 0){
                    listeThe.remove(nomThe);
                }
            }
            else if (nombre == -1) {
                listeThe.remove(nomThe);
            }
        }
    }

    public void setNombreThe(String nomThe, int nombre) {
        if (listeThe.containsKey(nomThe) && nombre > 0) {
            listeThe.replace(nomThe, nombre);
        }
    }

    public HashMap<String, Integer> getListeThe() {
        return listeThe;
    }

    public int getId() {
        return id;
    }

    public int getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setListeThe(HashMap<String, Integer> listeThe) {
        this.listeThe = listeThe;
    }
}
