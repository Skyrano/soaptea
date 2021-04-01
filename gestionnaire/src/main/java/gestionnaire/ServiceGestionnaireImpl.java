package gestionnaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "gestionnaire.ServiceGestionnaire", serviceName = "ServiceGestionnaire", portName = "GestionnairePort")
public class ServiceGestionnaireImpl implements ServiceGestionnaire {

    private ArrayList<Commande> commandes;

    @Override
    public boolean notifierCommande(Commande commande) {
        return false;
    }

    @Override
    public boolean theEnPreparation(int id) {
        return false;
    }

    @Override
    public boolean thePrepare(int id) {
        return false;
    }

    @Override
    public boolean colisAuLivreur(int id) {
        return false;
    }

    @Override
    public boolean theLivre(int id) {
        return false;
    }
}
