
package gestionnaire.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gestionnaire.Commande;

@XmlRootElement(name = "notifierCommande", namespace = "http://ensibs.projet.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "notifierCommande", namespace = "http://ensibs.projet.fr/")
public class NotifierCommande {

    @XmlElement(name = "arg0", namespace = "")
    private Commande arg0;

    /**
     * 
     * @return
     *     returns Commande
     */
    public Commande getArg0() {
        return this.arg0;
    }

    /**
     * 
     * @param arg0
     *     the value for the arg0 property
     */
    public void setArg0(Commande arg0) {
        this.arg0 = arg0;
    }

}
