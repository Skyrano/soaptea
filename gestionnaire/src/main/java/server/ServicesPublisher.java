package server;

import server.impl.*;

import javax.xml.ws.Endpoint;

public class ServicesPublisher {

    public static void main(String[] args) throws ClassNotFoundException {
        ServiceGestionnaireImpl gestionnaire =  new ServiceGestionnaireImpl();

        ServiceClientImpl client = new ServiceClientImpl();
        client.setGestionnaire(gestionnaire);

        ServiceInventaireImpl inventaire = new ServiceInventaireImpl();
        inventaire.setGestionnaire(gestionnaire);

        ServiceLivraisonImpl livraison = new ServiceLivraisonImpl();
        livraison.setGestionnaire(gestionnaire);

        ServicePreparationImpl preparation = new ServicePreparationImpl();
        preparation.setGestionnaire(gestionnaire);

        Endpoint.publish("http://localhost:9991/ws/ServiceGestionnaire", gestionnaire);
        Endpoint.publish("http://localhost:9991/ws/ServiceClient", client);
        Endpoint.publish("http://localhost:9991/ws/ServiceInventaire", inventaire);
        Endpoint.publish("http://localhost:9991/ws/ServiceLivraison", livraison);
        Endpoint.publish("http://localhost:9991/ws/ServicePreparation", preparation);
    }

}
