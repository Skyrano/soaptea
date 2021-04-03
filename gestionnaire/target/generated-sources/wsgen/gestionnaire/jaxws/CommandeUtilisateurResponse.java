
package gestionnaire.jaxws;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "commandeUtilisateurResponse", namespace = "http://ensibs.projet.fr/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "commandeUtilisateurResponse", namespace = "http://ensibs.projet.fr/")
public class CommandeUtilisateurResponse {

    @XmlElement(name = "return", namespace = "")
    private ArrayList<Integer> _return;

    /**
     * 
     * @return
     *     returns ArrayList<Integer>
     */
    public ArrayList<Integer> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(ArrayList<Integer> _return) {
        this._return = _return;
    }

}
