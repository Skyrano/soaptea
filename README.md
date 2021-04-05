###1) Pour utiliser l'application avec les autres modules

####Aller dans le module **gestionnaire** : 

- mvn clean install

- Lancer le module **gestionnaire** avec Java ou suivre partie 2)

####Revenir dans le projet principal :

- mvn jaxws:wsimport

- mvn clean generate-sources

- mvn clean install

- Les autres modules peuvent être utilisés


###2) Pour utiliser l'application en WAR dans un Docker

####Aller dans le module **gestionnaire** :

- mvn clean package -P war

- Dans l'archive WAR, copier *sun-jaxws.xml* dans /WEB-INF

- docker pull tomcat:9.0.12-jre11-slim

- docker run --rm --name ServiceClient -v "chemin/vers/gestionnaire-v1.war:/usr/local/tomcat/webapps/ws.war" -it -p 8080:8080 tomcat:9.0.12-jre11-slim


###3) Test des services

Les services sont accessibles à l'adresse http://localhost:9991/ws/service?wsdl, en remplaçant "*service*" par le service voulu (*client*, *inventaire*, *livraison* ou *preparation*).

L'utilisation des services est donnée dans la Javadoc.
