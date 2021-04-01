package gestionnaire;

import javax.xml.ws.Endpoint;

public class ServiceGestionnairePublisher {

    public static void main(String[] args) throws ClassNotFoundException {
        Endpoint.publish("http://localhost:9991/ws/ServiceGestionnaire", new ServiceGestionnaireImpl());
    }

}
