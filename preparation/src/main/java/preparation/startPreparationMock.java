package preparation;

import java.io.IOException;
import java.util.HashMap;

public class startPreparationMock {

    public static void main(String[] args) throws IOException {

        HashMap<String, Integer> listeThe = new HashMap<>();
        listeThe.put("The vert au citron", 5);
        listeThe.put("The vert à la menthe", 2);
        listeThe.put("The noir à la Marie-Jeanne", 25);


        TeaProcess tea = new TeaProcess(1, 1, listeThe, "Debut");
    }
}
