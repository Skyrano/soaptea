package server;

import server.impl.*;

import javax.xml.ws.Endpoint;

public class ServicesPublisher {

    public static void main(String[] args) throws ClassNotFoundException {
        Endpoint.publish("http://localhost:9991/ws/client", new ServiceClientImpl());
        Endpoint.publish("http://localhost:9991/ws/inventaire", new ServiceInventaireImpl());
        Endpoint.publish("http://localhost:9991/ws/livraison", new ServiceLivraisonImpl());
        Endpoint.publish("http://localhost:9991/ws/preparation", new ServicePreparationImpl());
    }

}
