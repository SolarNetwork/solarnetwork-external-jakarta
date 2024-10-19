
package net.solarnetwork.external.sunspec.plantextract.jakarta;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="plant" type="{}Plant"/&gt;
 *         &lt;element ref="{}sunSpecData" minOccurs="0"/&gt;
 *         &lt;element name="sunSpecMetadata" type="{}SunSpecMetadata" minOccurs="0"/&gt;
 *         &lt;element name="strings" type="{}Strings" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extractExtensions" type="{}Extensions" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="t" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="seqId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="lastSeqId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="v" type="{http://www.w3.org/2001/XMLSchema}string" default="1" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "plant",
    "sunSpecData",
    "sunSpecMetadata",
    "strings",
    "extractExtensions"
})
@XmlRootElement(name = "sunSpecPlantExtract")
public class SunSpecPlantExtract {

    @XmlElement(required = true)
    protected Plant plant;
    protected SunSpecData sunSpecData;
    protected SunSpecMetadata sunSpecMetadata;
    protected List<Strings> strings;
    protected Extensions extractExtensions;
    @XmlAttribute(name = "t", required = true)
    protected String t;
    @XmlAttribute(name = "seqId")
    protected String seqId;
    @XmlAttribute(name = "lastSeqId")
    protected String lastSeqId;
    @XmlAttribute(name = "v")
    protected String v;

    /**
     * Gets the value of the plant property.
     * 
     * @return
     *     possible object is
     *     {@link Plant }
     *     
     */
    public Plant getPlant() {
        return plant;
    }

    /**
     * Sets the value of the plant property.
     * 
     * @param value
     *     allowed object is
     *     {@link Plant }
     *     
     */
    public void setPlant(Plant value) {
        this.plant = value;
    }

    /**
     * Gets the value of the sunSpecData property.
     * 
     * @return
     *     possible object is
     *     {@link SunSpecData }
     *     
     */
    public SunSpecData getSunSpecData() {
        return sunSpecData;
    }

    /**
     * Sets the value of the sunSpecData property.
     * 
     * @param value
     *     allowed object is
     *     {@link SunSpecData }
     *     
     */
    public void setSunSpecData(SunSpecData value) {
        this.sunSpecData = value;
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
     * Gets the value of the strings property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the strings property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStrings().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Strings }
     * 
     * 
     */
    public List<Strings> getStrings() {
        if (strings == null) {
            strings = new ArrayList<Strings>();
        }
        return this.strings;
    }

    /**
     * Gets the value of the extractExtensions property.
     * 
     * @return
     *     possible object is
     *     {@link Extensions }
     *     
     */
    public Extensions getExtractExtensions() {
        return extractExtensions;
    }

    /**
     * Sets the value of the extractExtensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Extensions }
     *     
     */
    public void setExtractExtensions(Extensions value) {
        this.extractExtensions = value;
    }

    /**
     * Gets the value of the t property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getT() {
        return t;
    }

    /**
     * Sets the value of the t property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setT(String value) {
        this.t = value;
    }

    /**
     * Gets the value of the seqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqId() {
        return seqId;
    }

    /**
     * Sets the value of the seqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqId(String value) {
        this.seqId = value;
    }

    /**
     * Gets the value of the lastSeqId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastSeqId() {
        return lastSeqId;
    }

    /**
     * Sets the value of the lastSeqId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastSeqId(String value) {
        this.lastSeqId = value;
    }

    /**
     * Gets the value of the v property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getV() {
        if (v == null) {
            return "1";
        } else {
            return v;
        }
    }

    /**
     * Sets the value of the v property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setV(String value) {
        this.v = value;
    }

}
