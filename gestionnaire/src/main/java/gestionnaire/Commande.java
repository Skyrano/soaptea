package gestionnaire;

import java.util.ArrayList;

public class Commande {

    private final int id;
    private ArrayList<String> listeThe;
    private ArrayList<Integer> nombreThe;
    private String etat;

    public Commande(int id, ArrayList<String> listeThe, ArrayList<Integer> nombreThe) {
        this.id = id;
        this.listeThe = listeThe;
        this.nombreThe = nombreThe;
    }

    public void ajouterThe(String nomThe, int nombre) {
        int index = listeThe.indexOf(nomThe);
        if (index == -1 && nombre > 0) {
            listeThe.add(nomThe);
            nombreThe.add(1);
        }
        else {
            nombreThe.set(index, nombreThe.get(index) + nombre);
        }
    }

    public void supprimerThe(String nomThe, int nombre) {
        int index = listeThe.indexOf(nomThe);
        if (index != -1 && nombre >= 0) {
            nombreThe.set(index, nombreThe.get(index) - nombre);
            if (nombreThe.get(index) <= 0){
                listeThe.remove(index);
                nombreThe.remove(index);
            }
        }
        else if (index != -1 && nombre == -1) {
            listeThe.remove(index);
            nombreThe.remove(index);
        }
    }

    public void setNombreThe(String nomThe, int nombre) {
        int index = listeThe.indexOf(nomThe);
        if (index != -1 && nombre > 0) {
            nombreThe.set(index, nombre);

        }
    }

    public ArrayList<String> getListeThe() {
        return listeThe;
    }

    public ArrayList<Integer> getNombreThe() {
        return nombreThe;
    }

    public int getId() {
        return id;
    }






}
