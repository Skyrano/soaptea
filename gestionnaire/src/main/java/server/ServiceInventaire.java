package server;

import javax.jws.WebService;
import java.util.ArrayList;

/**
 * Interface du service gérant la carte des thés
 */
@WebService(name = "inventaire", targetNamespace = "http://ensibs.projet.fr/")
public interface ServiceInventaire {

    /**
     * Met à jour la carte des thés vendus
     * @param carte la nouvelle liste des thés vendus
     * @return true si le changement est effectif, false sinon
     */
    boolean majCarte(ArrayList<String> carte);
}
