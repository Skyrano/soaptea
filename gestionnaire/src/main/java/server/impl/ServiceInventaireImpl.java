package server.impl;

import server.ServiceInventaire;

import javax.jws.WebService;
import java.util.ArrayList;

@WebService(endpointInterface = "server.ServiceInventaire", serviceName = "inventaire", portName = "inventairePort")
public class ServiceInventaireImpl implements ServiceInventaire {

    @Override
    public boolean majCarte(ArrayList<String> carte) {
        ArrayList<String> ancienneCarte = Gestionnaire.getCarte();
        ancienneCarte.clear();
        ancienneCarte.addAll(carte);
        return true;
    }

}
