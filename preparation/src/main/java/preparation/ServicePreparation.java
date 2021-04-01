package preparation;

import javax.jws.WebService;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Scanner;

@WebService(name = "ServicePreparation", targetNamespace = "http://ensibs.projet.fr/")
public interface ServicePreparation {

    public boolean debutPreparation(int id);

}
