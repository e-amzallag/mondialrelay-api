
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Enseigne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NbResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Security" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "enseigne",
    "pays",
    "ville",
    "cp",
    "nbResult",
    "security"
})
@XmlRootElement(name = "WSI2_RechercheCP")
public class WSI2RechercheCP {

    @XmlElement(name = "Enseigne")
    protected String enseigne;
    @XmlElement(name = "Pays")
    protected String pays;
    @XmlElement(name = "Ville")
    protected String ville;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "NbResult")
    protected String nbResult;
    @XmlElement(name = "Security")
    protected String security;

    /**
     * Obtient la valeur de la propri�t� enseigne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnseigne() {
        return enseigne;
    }

    /**
     * D�finit la valeur de la propri�t� enseigne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnseigne(String value) {
        this.enseigne = value;
    }

    /**
     * Obtient la valeur de la propri�t� pays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPays() {
        return pays;
    }

    /**
     * D�finit la valeur de la propri�t� pays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPays(String value) {
        this.pays = value;
    }

    /**
     * Obtient la valeur de la propri�t� ville.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVille() {
        return ville;
    }

    /**
     * D�finit la valeur de la propri�t� ville.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVille(String value) {
        this.ville = value;
    }

    /**
     * Obtient la valeur de la propri�t� cp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCP() {
        return cp;
    }

    /**
     * D�finit la valeur de la propri�t� cp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCP(String value) {
        this.cp = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbResult() {
        return nbResult;
    }

    /**
     * D�finit la valeur de la propri�t� nbResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbResult(String value) {
        this.nbResult = value;
    }

    /**
     * Obtient la valeur de la propri�t� security.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecurity() {
        return security;
    }

    /**
     * D�finit la valeur de la propri�t� security.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecurity(String value) {
        this.security = value;
    }

}
