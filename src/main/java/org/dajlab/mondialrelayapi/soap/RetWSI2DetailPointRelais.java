
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour ret_WSI2_DetailPointRelais complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_DetailPointRelais">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="Num" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LgAdr4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localisation1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Localisation2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Horaires_Lundi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Mardi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Mercredi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Jeudi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Vendredi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Samedi" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Horaires_Dimanche" type="{http://www.mondialrelay.fr/webservice/}ArrayOfString" minOccurs="0"/>
 *         &lt;element name="Information" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL_Photo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL_Plan" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_DetailPointRelais", propOrder = {
    "num",
    "lgAdr1",
    "lgAdr2",
    "lgAdr3",
    "lgAdr4",
    "cp",
    "ville",
    "pays",
    "localisation1",
    "localisation2",
    "horairesLundi",
    "horairesMardi",
    "horairesMercredi",
    "horairesJeudi",
    "horairesVendredi",
    "horairesSamedi",
    "horairesDimanche",
    "information",
    "urlPhoto",
    "urlPlan"
})
public class RetWSI2DetailPointRelais
    extends Ret
{

    @XmlElement(name = "Num")
    protected String num;
    @XmlElement(name = "LgAdr1")
    protected String lgAdr1;
    @XmlElement(name = "LgAdr2")
    protected String lgAdr2;
    @XmlElement(name = "LgAdr3")
    protected String lgAdr3;
    @XmlElement(name = "LgAdr4")
    protected String lgAdr4;
    @XmlElement(name = "CP")
    protected String cp;
    @XmlElement(name = "Ville")
    protected String ville;
    @XmlElement(name = "Pays")
    protected String pays;
    @XmlElement(name = "Localisation1")
    protected String localisation1;
    @XmlElement(name = "Localisation2")
    protected String localisation2;
    @XmlElement(name = "Horaires_Lundi")
    protected ArrayOfString horairesLundi;
    @XmlElement(name = "Horaires_Mardi")
    protected ArrayOfString horairesMardi;
    @XmlElement(name = "Horaires_Mercredi")
    protected ArrayOfString horairesMercredi;
    @XmlElement(name = "Horaires_Jeudi")
    protected ArrayOfString horairesJeudi;
    @XmlElement(name = "Horaires_Vendredi")
    protected ArrayOfString horairesVendredi;
    @XmlElement(name = "Horaires_Samedi")
    protected ArrayOfString horairesSamedi;
    @XmlElement(name = "Horaires_Dimanche")
    protected ArrayOfString horairesDimanche;
    @XmlElement(name = "Information")
    protected String information;
    @XmlElement(name = "URL_Photo")
    protected String urlPhoto;
    @XmlElement(name = "URL_Plan")
    protected String urlPlan;

    /**
     * Obtient la valeur de la propri�t� num.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNum() {
        return num;
    }

    /**
     * D�finit la valeur de la propri�t� num.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNum(String value) {
        this.num = value;
    }

    /**
     * Obtient la valeur de la propri�t� lgAdr1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr1() {
        return lgAdr1;
    }

    /**
     * D�finit la valeur de la propri�t� lgAdr1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr1(String value) {
        this.lgAdr1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� lgAdr2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr2() {
        return lgAdr2;
    }

    /**
     * D�finit la valeur de la propri�t� lgAdr2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr2(String value) {
        this.lgAdr2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� lgAdr3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr3() {
        return lgAdr3;
    }

    /**
     * D�finit la valeur de la propri�t� lgAdr3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr3(String value) {
        this.lgAdr3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� lgAdr4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLgAdr4() {
        return lgAdr4;
    }

    /**
     * D�finit la valeur de la propri�t� lgAdr4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLgAdr4(String value) {
        this.lgAdr4 = value;
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
     * Obtient la valeur de la propri�t� localisation1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisation1() {
        return localisation1;
    }

    /**
     * D�finit la valeur de la propri�t� localisation1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisation1(String value) {
        this.localisation1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� localisation2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalisation2() {
        return localisation2;
    }

    /**
     * D�finit la valeur de la propri�t� localisation2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalisation2(String value) {
        this.localisation2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� horairesLundi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesLundi() {
        return horairesLundi;
    }

    /**
     * D�finit la valeur de la propri�t� horairesLundi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesLundi(ArrayOfString value) {
        this.horairesLundi = value;
    }

    /**
     * Obtient la valeur de la propri�t� horairesMardi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesMardi() {
        return horairesMardi;
    }

    /**
     * D�finit la valeur de la propri�t� horairesMardi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesMardi(ArrayOfString value) {
        this.horairesMardi = value;
    }

    /**
     * Obtient la valeur de la propri�t� horairesMercredi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesMercredi() {
        return horairesMercredi;
    }

    /**
     * D�finit la valeur de la propri�t� horairesMercredi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesMercredi(ArrayOfString value) {
        this.horairesMercredi = value;
    }

    /**
     * Obtient la valeur de la propri�t� horairesJeudi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesJeudi() {
        return horairesJeudi;
    }

    /**
     * D�finit la valeur de la propri�t� horairesJeudi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesJeudi(ArrayOfString value) {
        this.horairesJeudi = value;
    }

    /**
     * Obtient la valeur de la propri�t� horairesVendredi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesVendredi() {
        return horairesVendredi;
    }

    /**
     * D�finit la valeur de la propri�t� horairesVendredi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesVendredi(ArrayOfString value) {
        this.horairesVendredi = value;
    }

    /**
     * Obtient la valeur de la propri�t� horairesSamedi.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesSamedi() {
        return horairesSamedi;
    }

    /**
     * D�finit la valeur de la propri�t� horairesSamedi.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesSamedi(ArrayOfString value) {
        this.horairesSamedi = value;
    }

    /**
     * Obtient la valeur de la propri�t� horairesDimanche.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getHorairesDimanche() {
        return horairesDimanche;
    }

    /**
     * D�finit la valeur de la propri�t� horairesDimanche.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setHorairesDimanche(ArrayOfString value) {
        this.horairesDimanche = value;
    }

    /**
     * Obtient la valeur de la propri�t� information.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInformation() {
        return information;
    }

    /**
     * D�finit la valeur de la propri�t� information.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInformation(String value) {
        this.information = value;
    }

    /**
     * Obtient la valeur de la propri�t� urlPhoto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPhoto() {
        return urlPhoto;
    }

    /**
     * D�finit la valeur de la propri�t� urlPhoto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPhoto(String value) {
        this.urlPhoto = value;
    }

    /**
     * Obtient la valeur de la propri�t� urlPlan.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLPlan() {
        return urlPlan;
    }

    /**
     * D�finit la valeur de la propri�t� urlPlan.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLPlan(String value) {
        this.urlPlan = value;
    }

}
