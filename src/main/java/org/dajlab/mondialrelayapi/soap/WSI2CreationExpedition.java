
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
 *         &lt;element name="ModeCol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ModeLiv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NDossier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NClient" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Langage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ad1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ad2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ad3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ad4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Tel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Tel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expe_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Langage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ad1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ad2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ad3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ad4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Ville" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_CP" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Tel1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Tel2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dest_Mail" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Poids" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longueur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Taille" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NbColis" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRT_Valeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CRT_Devise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Valeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Exp_Devise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COL_Rel_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="COL_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIV_Rel_Pays" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LIV_Rel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TAvisage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TReprise" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Montage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TRDV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Assurance" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Instructions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "modeCol",
    "modeLiv",
    "nDossier",
    "nClient",
    "expeLangage",
    "expeAd1",
    "expeAd2",
    "expeAd3",
    "expeAd4",
    "expeVille",
    "expeCP",
    "expePays",
    "expeTel1",
    "expeTel2",
    "expeMail",
    "destLangage",
    "destAd1",
    "destAd2",
    "destAd3",
    "destAd4",
    "destVille",
    "destCP",
    "destPays",
    "destTel1",
    "destTel2",
    "destMail",
    "poids",
    "longueur",
    "taille",
    "nbColis",
    "crtValeur",
    "crtDevise",
    "expValeur",
    "expDevise",
    "colRelPays",
    "colRel",
    "livRelPays",
    "livRel",
    "tAvisage",
    "tReprise",
    "montage",
    "trdv",
    "assurance",
    "instructions",
    "security"
})
@XmlRootElement(name = "WSI2_CreationExpedition")
public class WSI2CreationExpedition {

    @XmlElement(name = "Enseigne")
    protected String enseigne;
    @XmlElement(name = "ModeCol")
    protected String modeCol;
    @XmlElement(name = "ModeLiv")
    protected String modeLiv;
    @XmlElement(name = "NDossier")
    protected String nDossier;
    @XmlElement(name = "NClient")
    protected String nClient;
    @XmlElement(name = "Expe_Langage")
    protected String expeLangage;
    @XmlElement(name = "Expe_Ad1")
    protected String expeAd1;
    @XmlElement(name = "Expe_Ad2")
    protected String expeAd2;
    @XmlElement(name = "Expe_Ad3")
    protected String expeAd3;
    @XmlElement(name = "Expe_Ad4")
    protected String expeAd4;
    @XmlElement(name = "Expe_Ville")
    protected String expeVille;
    @XmlElement(name = "Expe_CP")
    protected String expeCP;
    @XmlElement(name = "Expe_Pays")
    protected String expePays;
    @XmlElement(name = "Expe_Tel1")
    protected String expeTel1;
    @XmlElement(name = "Expe_Tel2")
    protected String expeTel2;
    @XmlElement(name = "Expe_Mail")
    protected String expeMail;
    @XmlElement(name = "Dest_Langage")
    protected String destLangage;
    @XmlElement(name = "Dest_Ad1")
    protected String destAd1;
    @XmlElement(name = "Dest_Ad2")
    protected String destAd2;
    @XmlElement(name = "Dest_Ad3")
    protected String destAd3;
    @XmlElement(name = "Dest_Ad4")
    protected String destAd4;
    @XmlElement(name = "Dest_Ville")
    protected String destVille;
    @XmlElement(name = "Dest_CP")
    protected String destCP;
    @XmlElement(name = "Dest_Pays")
    protected String destPays;
    @XmlElement(name = "Dest_Tel1")
    protected String destTel1;
    @XmlElement(name = "Dest_Tel2")
    protected String destTel2;
    @XmlElement(name = "Dest_Mail")
    protected String destMail;
    @XmlElement(name = "Poids")
    protected String poids;
    @XmlElement(name = "Longueur")
    protected String longueur;
    @XmlElement(name = "Taille")
    protected String taille;
    @XmlElement(name = "NbColis")
    protected String nbColis;
    @XmlElement(name = "CRT_Valeur")
    protected String crtValeur;
    @XmlElement(name = "CRT_Devise")
    protected String crtDevise;
    @XmlElement(name = "Exp_Valeur")
    protected String expValeur;
    @XmlElement(name = "Exp_Devise")
    protected String expDevise;
    @XmlElement(name = "COL_Rel_Pays")
    protected String colRelPays;
    @XmlElement(name = "COL_Rel")
    protected String colRel;
    @XmlElement(name = "LIV_Rel_Pays")
    protected String livRelPays;
    @XmlElement(name = "LIV_Rel")
    protected String livRel;
    @XmlElement(name = "TAvisage")
    protected String tAvisage;
    @XmlElement(name = "TReprise")
    protected String tReprise;
    @XmlElement(name = "Montage")
    protected String montage;
    @XmlElement(name = "TRDV")
    protected String trdv;
    @XmlElement(name = "Assurance")
    protected String assurance;
    @XmlElement(name = "Instructions")
    protected String instructions;
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
     * Obtient la valeur de la propri�t� modeCol.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeCol() {
        return modeCol;
    }

    /**
     * D�finit la valeur de la propri�t� modeCol.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeCol(String value) {
        this.modeCol = value;
    }

    /**
     * Obtient la valeur de la propri�t� modeLiv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModeLiv() {
        return modeLiv;
    }

    /**
     * D�finit la valeur de la propri�t� modeLiv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModeLiv(String value) {
        this.modeLiv = value;
    }

    /**
     * Obtient la valeur de la propri�t� nDossier.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNDossier() {
        return nDossier;
    }

    /**
     * D�finit la valeur de la propri�t� nDossier.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNDossier(String value) {
        this.nDossier = value;
    }

    /**
     * Obtient la valeur de la propri�t� nClient.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNClient() {
        return nClient;
    }

    /**
     * D�finit la valeur de la propri�t� nClient.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNClient(String value) {
        this.nClient = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeLangage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeLangage() {
        return expeLangage;
    }

    /**
     * D�finit la valeur de la propri�t� expeLangage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeLangage(String value) {
        this.expeLangage = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeAd1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeAd1() {
        return expeAd1;
    }

    /**
     * D�finit la valeur de la propri�t� expeAd1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeAd1(String value) {
        this.expeAd1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeAd2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeAd2() {
        return expeAd2;
    }

    /**
     * D�finit la valeur de la propri�t� expeAd2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeAd2(String value) {
        this.expeAd2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeAd3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeAd3() {
        return expeAd3;
    }

    /**
     * D�finit la valeur de la propri�t� expeAd3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeAd3(String value) {
        this.expeAd3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeAd4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeAd4() {
        return expeAd4;
    }

    /**
     * D�finit la valeur de la propri�t� expeAd4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeAd4(String value) {
        this.expeAd4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeVille.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeVille() {
        return expeVille;
    }

    /**
     * D�finit la valeur de la propri�t� expeVille.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeVille(String value) {
        this.expeVille = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeCP() {
        return expeCP;
    }

    /**
     * D�finit la valeur de la propri�t� expeCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeCP(String value) {
        this.expeCP = value;
    }

    /**
     * Obtient la valeur de la propri�t� expePays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpePays() {
        return expePays;
    }

    /**
     * D�finit la valeur de la propri�t� expePays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpePays(String value) {
        this.expePays = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeTel1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeTel1() {
        return expeTel1;
    }

    /**
     * D�finit la valeur de la propri�t� expeTel1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeTel1(String value) {
        this.expeTel1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeTel2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeTel2() {
        return expeTel2;
    }

    /**
     * D�finit la valeur de la propri�t� expeTel2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeTel2(String value) {
        this.expeTel2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� expeMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpeMail() {
        return expeMail;
    }

    /**
     * D�finit la valeur de la propri�t� expeMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpeMail(String value) {
        this.expeMail = value;
    }

    /**
     * Obtient la valeur de la propri�t� destLangage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestLangage() {
        return destLangage;
    }

    /**
     * D�finit la valeur de la propri�t� destLangage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestLangage(String value) {
        this.destLangage = value;
    }

    /**
     * Obtient la valeur de la propri�t� destAd1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAd1() {
        return destAd1;
    }

    /**
     * D�finit la valeur de la propri�t� destAd1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAd1(String value) {
        this.destAd1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� destAd2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAd2() {
        return destAd2;
    }

    /**
     * D�finit la valeur de la propri�t� destAd2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAd2(String value) {
        this.destAd2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� destAd3.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAd3() {
        return destAd3;
    }

    /**
     * D�finit la valeur de la propri�t� destAd3.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAd3(String value) {
        this.destAd3 = value;
    }

    /**
     * Obtient la valeur de la propri�t� destAd4.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestAd4() {
        return destAd4;
    }

    /**
     * D�finit la valeur de la propri�t� destAd4.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestAd4(String value) {
        this.destAd4 = value;
    }

    /**
     * Obtient la valeur de la propri�t� destVille.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestVille() {
        return destVille;
    }

    /**
     * D�finit la valeur de la propri�t� destVille.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestVille(String value) {
        this.destVille = value;
    }

    /**
     * Obtient la valeur de la propri�t� destCP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestCP() {
        return destCP;
    }

    /**
     * D�finit la valeur de la propri�t� destCP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestCP(String value) {
        this.destCP = value;
    }

    /**
     * Obtient la valeur de la propri�t� destPays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestPays() {
        return destPays;
    }

    /**
     * D�finit la valeur de la propri�t� destPays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestPays(String value) {
        this.destPays = value;
    }

    /**
     * Obtient la valeur de la propri�t� destTel1.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestTel1() {
        return destTel1;
    }

    /**
     * D�finit la valeur de la propri�t� destTel1.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestTel1(String value) {
        this.destTel1 = value;
    }

    /**
     * Obtient la valeur de la propri�t� destTel2.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestTel2() {
        return destTel2;
    }

    /**
     * D�finit la valeur de la propri�t� destTel2.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestTel2(String value) {
        this.destTel2 = value;
    }

    /**
     * Obtient la valeur de la propri�t� destMail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestMail() {
        return destMail;
    }

    /**
     * D�finit la valeur de la propri�t� destMail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestMail(String value) {
        this.destMail = value;
    }

    /**
     * Obtient la valeur de la propri�t� poids.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPoids() {
        return poids;
    }

    /**
     * D�finit la valeur de la propri�t� poids.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPoids(String value) {
        this.poids = value;
    }

    /**
     * Obtient la valeur de la propri�t� longueur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongueur() {
        return longueur;
    }

    /**
     * D�finit la valeur de la propri�t� longueur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongueur(String value) {
        this.longueur = value;
    }

    /**
     * Obtient la valeur de la propri�t� taille.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaille() {
        return taille;
    }

    /**
     * D�finit la valeur de la propri�t� taille.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaille(String value) {
        this.taille = value;
    }

    /**
     * Obtient la valeur de la propri�t� nbColis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNbColis() {
        return nbColis;
    }

    /**
     * D�finit la valeur de la propri�t� nbColis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNbColis(String value) {
        this.nbColis = value;
    }

    /**
     * Obtient la valeur de la propri�t� crtValeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRTValeur() {
        return crtValeur;
    }

    /**
     * D�finit la valeur de la propri�t� crtValeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRTValeur(String value) {
        this.crtValeur = value;
    }

    /**
     * Obtient la valeur de la propri�t� crtDevise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCRTDevise() {
        return crtDevise;
    }

    /**
     * D�finit la valeur de la propri�t� crtDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCRTDevise(String value) {
        this.crtDevise = value;
    }

    /**
     * Obtient la valeur de la propri�t� expValeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpValeur() {
        return expValeur;
    }

    /**
     * D�finit la valeur de la propri�t� expValeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpValeur(String value) {
        this.expValeur = value;
    }

    /**
     * Obtient la valeur de la propri�t� expDevise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpDevise() {
        return expDevise;
    }

    /**
     * D�finit la valeur de la propri�t� expDevise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpDevise(String value) {
        this.expDevise = value;
    }

    /**
     * Obtient la valeur de la propri�t� colRelPays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLRelPays() {
        return colRelPays;
    }

    /**
     * D�finit la valeur de la propri�t� colRelPays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLRelPays(String value) {
        this.colRelPays = value;
    }

    /**
     * Obtient la valeur de la propri�t� colRel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCOLRel() {
        return colRel;
    }

    /**
     * D�finit la valeur de la propri�t� colRel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCOLRel(String value) {
        this.colRel = value;
    }

    /**
     * Obtient la valeur de la propri�t� livRelPays.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIVRelPays() {
        return livRelPays;
    }

    /**
     * D�finit la valeur de la propri�t� livRelPays.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIVRelPays(String value) {
        this.livRelPays = value;
    }

    /**
     * Obtient la valeur de la propri�t� livRel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLIVRel() {
        return livRel;
    }

    /**
     * D�finit la valeur de la propri�t� livRel.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLIVRel(String value) {
        this.livRel = value;
    }

    /**
     * Obtient la valeur de la propri�t� tAvisage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTAvisage() {
        return tAvisage;
    }

    /**
     * D�finit la valeur de la propri�t� tAvisage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTAvisage(String value) {
        this.tAvisage = value;
    }

    /**
     * Obtient la valeur de la propri�t� tReprise.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTReprise() {
        return tReprise;
    }

    /**
     * D�finit la valeur de la propri�t� tReprise.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTReprise(String value) {
        this.tReprise = value;
    }

    /**
     * Obtient la valeur de la propri�t� montage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMontage() {
        return montage;
    }

    /**
     * D�finit la valeur de la propri�t� montage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMontage(String value) {
        this.montage = value;
    }

    /**
     * Obtient la valeur de la propri�t� trdv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRDV() {
        return trdv;
    }

    /**
     * D�finit la valeur de la propri�t� trdv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRDV(String value) {
        this.trdv = value;
    }

    /**
     * Obtient la valeur de la propri�t� assurance.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssurance() {
        return assurance;
    }

    /**
     * D�finit la valeur de la propri�t� assurance.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssurance(String value) {
        this.assurance = value;
    }

    /**
     * Obtient la valeur de la propri�t� instructions.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstructions() {
        return instructions;
    }

    /**
     * D�finit la valeur de la propri�t� instructions.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstructions(String value) {
        this.instructions = value;
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
