
package hello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Address" type="{http://hello}holder"/>
 *         &lt;element name="Address2" type="{http://hello}holder"/>
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
    "address",
    "address2"
})
@XmlRootElement(name = "updateAddress")
public class UpdateAddress {

    @XmlElement(name = "Address", required = true, nillable = true)
    protected Holder address;
    @XmlElement(name = "Address2", required = true, nillable = true)
    protected Holder address2;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Holder }
     *     
     */
    public Holder getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Holder }
     *     
     */
    public void setAddress(Holder value) {
        this.address = value;
    }

    /**
     * Gets the value of the address2 property.
     * 
     * @return
     *     possible object is
     *     {@link Holder }
     *     
     */
    public Holder getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link Holder }
     *     
     */
    public void setAddress2(Holder value) {
        this.address2 = value;
    }

}
