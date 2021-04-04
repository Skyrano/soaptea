package preparation;

import javax.jws.WebService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

@WebService(endpointInterface = "preparation.ServicePreparation", serviceName = "ServicePreparation", portName = "PreparationPort")
public class ServicePreparationImpl implements ServicePreparation {

    @Override
    public boolean debutPreparation(int id, int idUtilisateur, HashMap<String, Integer> listeThe, String etat){

        TeaProcess tea = new TeaProcess(id, idUtilisateur, listeThe, etat);

        return true;
    }

}
