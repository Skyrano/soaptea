package preparation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ServicePreparationImpl implements ServicePreparation {

    @Override
    public boolean debutPreparation(int id, int idUtilisateur, HashMap<String, Integer> listeThe, String etat){

        TeaProcess tea = new TeaProcess(id, idUtilisateur, listeThe, etat);

        return true;
    }



    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> listeThe = new HashMap<>();
        listeThe.put("The vert au citron", 5);
        listeThe.put("The vert à la menthe", 2);
        listeThe.put("The noir à la Marie-Jeanne", 25);


        TeaProcess tea = new TeaProcess(1, 1, listeThe, "Debut");
    }
}
