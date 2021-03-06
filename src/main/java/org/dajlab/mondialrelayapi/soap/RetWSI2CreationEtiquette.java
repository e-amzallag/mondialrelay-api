
package org.dajlab.mondialrelayapi.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Classe Java pour ret_WSI2_CreationEtiquette complex type.
 * 
 * <p>
 * Le fragment de schéma suivant indique le contenu attendu figurant dans cette
 * classe.
 * 
 * <pre>
 * &lt;complexType name="ret_WSI2_CreationEtiquette">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.mondialrelay.fr/webservice/}ret_">
 *       &lt;sequence>
 *         &lt;element name="ExpeditionNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="URL_Etiquette" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ret_WSI2_CreationEtiquette", propOrder = { "expeditionNum", "urlEtiquette" })
public class RetWSI2CreationEtiquette extends Ret {

	@XmlElement(name = "ExpeditionNum")
	protected String expeditionNum;
	@XmlElement(name = "URL_Etiquette")
	protected String urlEtiquette;

	/**
	 * Obtient la valeur de la propriété expeditionNum.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getExpeditionNum() {
		return expeditionNum;
	}

	/**
	 * Définit la valeur de la propriété expeditionNum.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setExpeditionNum(String value) {
		this.expeditionNum = value;
	}

	/**
	 * Obtient la valeur de la propriété urlEtiquette.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getURLEtiquette() {
		return urlEtiquette;
	}

	/**
	 * Définit la valeur de la propriété urlEtiquette.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setURLEtiquette(String value) {
		this.urlEtiquette = value;
	}

}
