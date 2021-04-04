package server;

import server.impl.*;

import javax.xml.ws.Endpoint;

/**
 * Classe publiant les services SOAP WSDL sur le port 9991
 */
public class ServicesPublisher {

    /**
     * Classe main à lancer pour rendre accessible les services
     * @param args
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException {
        Endpoint.publish("http://localhost:9991/ws/client", new ServiceClientImpl());
        Endpoint.publish("http://localhost:9991/ws/inventaire", new ServiceInventaireImpl());
        Endpoint.publish("http://localhost:9991/ws/livraison", new ServiceLivraisonImpl());
        Endpoint.publish("http://localhost:9991/ws/preparation", new ServicePreparationImpl());
    }

}
