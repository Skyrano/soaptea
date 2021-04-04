package preparation;

import javax.jws.WebService;
import java.util.HashMap;

@WebService(endpointInterface = "preparation.ServicePreparationCallBack", serviceName = "ServicePreparation", portName = "PreparationPort")
public class ServicePreparationCallBackImpl implements ServicePreparationCallBack {

    @Override
    public boolean debutPreparation(int id, int idUtilisateur, HashMap<String, Integer> listeThe, String etat){

        TeaProcess tea = new TeaProcess(id, idUtilisateur, listeThe, etat);

        return true;
    }

}
