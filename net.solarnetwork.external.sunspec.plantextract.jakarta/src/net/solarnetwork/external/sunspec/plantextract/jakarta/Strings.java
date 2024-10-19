
package net.solarnetwork.external.sunspec.plantextract.jakarta;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Strings complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Strings"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plant" type="{}StringsPlant" minOccurs="0"/&gt;
 *         &lt;element name="sunSpecMetadata" type="{}SunSpecMetadata" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="locale" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Strings", propOrder = {
    "plant",
    "sunSpecMetadata"
})
public class Strings {

    protected StringsPlant plant;
    protected SunSpecMetadata sunSpecMetadata;
    @XmlAttribute(name = "locale", required = true)
    protected String locale;

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link StringsPlant }
     *     
     */
    public StringsPlant getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link StringsPlant }
     *     
     */
    public void setPlant(StringsPlant value) {
        this.plant = value;
    }

    /**
     * Gets the value of the sunSpecMetadata property.
     * 
     * @return
     *     possible object is
     *     {@link SunSpecMetadata }
     *     
     */
    public SunSpecMetadata getSunSpecMetadata() {
        return sunSpecMetadata;
    }

    /**
     * Sets the value of the sunSpecMetadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link SunSpecMetadata }
     *     
     */
    public void setSunSpecMetadata(SunSpecMetadata value) {
        this.sunSpecMetadata = value;
    }

    /**
     * Gets the value of the locale property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocale() {
        return locale;
    }

    /**
     * Sets the value of the locale property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocale(String value) {
        this.locale = value;
    }

}
