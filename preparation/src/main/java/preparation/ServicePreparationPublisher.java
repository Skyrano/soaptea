package preparation;

import javax.xml.ws.Endpoint;

public class ServicePreparationPublisher {

    public static void main(String[] args) throws ClassNotFoundException {
        Endpoint.publish("http://localhost:9991/ws/ServicePreparation", new ServicePreparationImpl());
    }

}
